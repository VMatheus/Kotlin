package com.projeto.matheus.kotlin.domain

/**
 * Created by matheus on 02/12/17.
 */

class  PalindromoK ( conteudo: String ) {
   val conteudo: String = conteudo // var mutavel, val = final do java, so permite uma atribuiçao

    get(){
        return field.toLowerCase();
    }

    fun ehPalindromo(): Boolean {
      return  conteudo == conteudo.reversed()
    }

}