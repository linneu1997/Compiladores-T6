package br.ufscar.dc.compiladores.recipe;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    public enum TipoREC{
        NUMERO,
        INGREDIENTE,
        TEMPERO,
        CADEIA,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoREC tipo;

        private EntradaTabelaDeSimbolos(String nome, TipoREC tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoREC tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoREC verificar(String nome) {
        return tabela.get(nome).tipo;
    }
}

