package br.ufscar.dc.compiladores.recipe;

import br.ufscar.dc.compiladores.recipe.TabelaDeSimbolos.TipoREC;

public class RecipeSemantico extends RECIPEBaseVisitor<Void> {

    //Cria a tabela de simbolos:
    TabelaDeSimbolos tabela;

    //Visitante de Receita:
    @Override
    public Void visitReceita(RECIPEParser.ReceitaContext ctx) {
        tabela = new TabelaDeSimbolos();
        return super.visitReceita(ctx);
    }

    //Visitante da lista de ingredientes: Verifica se o ingrediente já está na tabela e o adiciona:
    @Override
    public Void visitLista_ingredientes(RECIPEParser.Lista_ingredientesContext ctx) {
        String nomeIng = ctx.INGREDIENTE().getText();
        if (tabela.existe(nomeIng)) {
            SemanticoUtils.adicionarErroSemantico(ctx.INGREDIENTE().getSymbol(), "Ingrediente " + nomeIng + " já adicionado.");
        } else {
            tabela.adicionar(nomeIng, TipoREC.INGREDIENTE);
        }
        return super.visitLista_ingredientes(ctx);
    }

    //Visitante da lista de temperos: Verifica se o tempero já está na tabela e o adiciona:
    @Override
    public Void visitLista_tempero(RECIPEParser.Lista_temperoContext ctx) {
        String nomeTemp = ctx.TEMPERO().getText();
        if (tabela.existe(nomeTemp)) {
            SemanticoUtils.adicionarErroSemantico(ctx.TEMPERO().getSymbol(), "Tempero " + nomeTemp + " já adicionado.");
        } else {
            tabela.adicionar(nomeTemp, TipoREC.TEMPERO);
        }

        return super.visitLista_tempero(ctx);
    }

    //Visitante do comando Asse:
    @Override
    public Void visitCmdAsse(RECIPEParser.CmdAsseContext ctx) {
        String Ing = ctx.INGREDIENTE().getText();
        if (!tabela.existe(Ing)) {
            SemanticoUtils.adicionarErroSemantico(ctx.INGREDIENTE().getSymbol(), "Ingrediente " + Ing + " não declarado.");
        }
        return super.visitCmdAsse(ctx);
    }
    
    //Visitante do comando Cozinhe:
    @Override
    public Void visitCmdCozinhe(RECIPEParser.CmdCozinheContext ctx) {
        String Ing = ctx.INGREDIENTE().getText();
        if (!tabela.existe(Ing)) {
            SemanticoUtils.adicionarErroSemantico(ctx.INGREDIENTE().getSymbol(), "Ingrediente " + Ing + " não declarado.");
        }
        return super.visitCmdCozinhe(ctx);
    }

    //Visitante do comando Corte:
    @Override
    public Void visitCmdCorte(RECIPEParser.CmdCorteContext ctx) {
        String Ing = ctx.INGREDIENTE().getText();
        if (!tabela.existe(Ing)) {
            SemanticoUtils.adicionarErroSemantico(ctx.INGREDIENTE().getSymbol(), "Ingrediente " + Ing + " não declarado.");
        }
        return super.visitCmdCorte(ctx);
    }

    //Visitante do comando Misture:
    @Override
    public Void visitCmdMisture(RECIPEParser.CmdMistureContext ctx) {
        for (var ing : ctx.INGREDIENTE()) {
            String nome_ing = ing.getText();
            if (!tabela.existe(nome_ing)) {
                SemanticoUtils.adicionarErroSemantico(ing.getSymbol(), "Ingrediente " + nome_ing + " não declarado.");
            }
        }
        return super.visitCmdMisture(ctx);
    }

    //Visitante do comando Bata:
    @Override
    public Void visitCmdBata(RECIPEParser.CmdBataContext ctx) {
        for (var ing : ctx.INGREDIENTE()) {
            String nome_ing = ing.getText();
            if (!tabela.existe(nome_ing)) {
                SemanticoUtils.adicionarErroSemantico(ing.getSymbol(), "Ingrediente " + nome_ing + " não declarado.");
            }
        }
        return super.visitCmdBata(ctx);
    }
}
