/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufscar.dc.compiladores.recipe;

import br.ufscar.dc.compiladores.recipe.TabelaDeSimbolos.TipoREC;

/**
 *
 * @author linne
 */
public class RecipeSemantico extends RECIPEBaseVisitor<Void> {

    TabelaDeSimbolos tabela;

    @Override
    public Void visitReceita(RECIPEParser.ReceitaContext ctx) {
        tabela = new TabelaDeSimbolos();
        return super.visitReceita(ctx);
    }

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

    @Override
    public Void visitCmdAsse(RECIPEParser.CmdAsseContext ctx) {
        String Ing = ctx.INGREDIENTE().getText();
        if (!tabela.existe(Ing)) {
            SemanticoUtils.adicionarErroSemantico(ctx.INGREDIENTE().getSymbol(), "Ingrediente " + Ing + " não declarado.");
        }
        return super.visitCmdAsse(ctx);
    }
    
    public Void visitCmdCozinhe(RECIPEParser.CmdCozinheContext ctx) {
        String Ing = ctx.INGREDIENTE().getText();
        if (!tabela.existe(Ing)) {
            SemanticoUtils.adicionarErroSemantico(ctx.INGREDIENTE().getSymbol(), "Ingrediente " + Ing + " não declarado.");
        }
        return super.visitCmdCozinhe(ctx);
    }


    @Override
    public Void visitCmdCorte(RECIPEParser.CmdCorteContext ctx) {
        String Ing = ctx.INGREDIENTE().getText();
        if (!tabela.existe(Ing)) {
            SemanticoUtils.adicionarErroSemantico(ctx.INGREDIENTE().getSymbol(), "Ingrediente " + Ing + " não declarado.");
        }
        return super.visitCmdCorte(ctx);
    }

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
