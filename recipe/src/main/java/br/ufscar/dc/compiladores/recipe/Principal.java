/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.ufscar.dc.compiladores.recipe;

/**
 *
 * @author linne
 */
import br.ufscar.dc.compiladores.recipe.RECIPEParser.ReceitaContext;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {

    public static void main(String[] args) throws IOException{
        CharStream cs = CharStreams.fromFileName(args[0]);
        RECIPELexer lexer = new RECIPELexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RECIPEParser parser = new RECIPEParser(tokens);
        ReceitaContext arvore = parser.receita();
        RecipeSemantico as = new RecipeSemantico();
        as.visitReceita(arvore);
        //Imprime os erros semânticos
        SemanticoUtils.errosSemanticos.forEach((s) -> System.out.println(s));
        
        //Se não há erros semânticos, traduz o programa para C:
        if(SemanticoUtils.errosSemanticos.isEmpty()) {
            RecipeGeradorHTML agc = new RecipeGeradorHTML();
            agc.visitReceita(arvore);
            try(PrintWriter pw = new PrintWriter(args[1])) {
                pw.print(agc.saida.toString());
            }
        }
    }
}
