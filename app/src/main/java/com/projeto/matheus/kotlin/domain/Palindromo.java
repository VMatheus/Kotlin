package com.projeto.matheus.kotlin.domain;

/**
 * Created by matheus on 02/12/17.
 */

public class Palindromo {
    private String conteudo;

    public Palindromo(String conteudo) {
        this.conteudo = conteudo;
    }


    public boolean ehPalindromo(){
        String invertido = new StringBuilder( conteudo).reverse().toString();

        return invertido.equalsIgnoreCase(conteudo);

    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
