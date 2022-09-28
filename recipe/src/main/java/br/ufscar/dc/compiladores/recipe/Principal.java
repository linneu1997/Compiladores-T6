
/**
 * Compiladores - Trabalho 6
 * Nome: Linneu Augusto Mendo Zanco - 769155
 */

package br.ufscar.dc.compiladores.recipe;

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
        
        //Se não há erros semânticos, traduz o programa para HTML:
        if(SemanticoUtils.errosSemanticos.isEmpty()) {
            RecipeGeradorHTML agc = new RecipeGeradorHTML();
            agc.visitReceita(arvore);
            try(PrintWriter pw = new PrintWriter(args[1])) {
                pw.print(agc.saida.toString());
            }
        }
    }
}
