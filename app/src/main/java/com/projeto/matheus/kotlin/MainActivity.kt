package com.projeto.matheus.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.projeto.matheus.kotlin.domain.PalindromoK
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener  {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }

    override fun onClick(view: View?) {

    val palindromo = PalindromoK(edit.text.toString())
        var resposta : String


        resposta = if(palindromo.ehPalindromo())
         "${palindromo.conteudo } é um palindromo"
        else
            "${palindromo.conteudo} NAO é um palindromo"


        text_resposta.text = resposta
    }

}
