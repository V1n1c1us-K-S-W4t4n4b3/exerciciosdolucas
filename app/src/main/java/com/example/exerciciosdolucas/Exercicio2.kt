package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExercicio2Binding

class Exercicio2 : AppCompatActivity() {
    private lateinit var binding: ActivityExercicio2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalcular.setOnClickListener {
            tabuada()
        }
    }

    fun tabuada() {

        // é onde bou escrever o numero da tabuada
        val textTabu = binding.editTabu

        // na vddera pra sair o resultado aqui
        val resultado = binding.resultTabu

        // converte o string do numero da tabuada em double
        val valor = textTabu.text.toString().toDouble()

        // passa o valor convertido para a variavel v1
        val v1 = valor

        // esse é a variavel q vai guardar o resultado da formula do println
        var resultadoFinal = ""

        // determina a sequencia de um numero minino ate um numero maximo
        for (i in 1..10) {

            // ela esta recebendo o resultado do valor digitado sendo multiplicado pelo numero da sequencia
            val product = v1 * i

            // a formula do numero digitado vezes o numero minimo ate o numero maximo dentro de uma variavel
            val formula = "$v1 * $i = $product"

            // ele imprimi o calculo no logcat
            println(formula)

            //a formula multiplicando o numero da tabuada em ate o numero de vezes escolhido em looping e quebrnado a linha para ser armazenado no resultfinal
            resultadoFinal += "$formula \n"


        }
        // aqui vai mostrar o que o resultado final guardou no text resultado
        resultado.text = resultadoFinal
    }
}


// para ser armazenado
// guardou no
// dentro
// que vai guardar