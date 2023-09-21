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

        binding.backButton.setOnClickListener { finish() }

        binding.calculeteButton.setOnClickListener {
            tabuada()
        }
    }

    fun tabuada() {

        // é onde vou escrever o numero da tabuada
        val textTabu = binding.editTabu

        // na vdd era pra sair o resultado aqui
        val resultado = binding.resultTabu

        // converte o string do numero da tabuada em double
        val valor = textTabu.text.toString().toDouble()

        // passa o valor convertido para a variavel v1
        val v1 = valor

        // variavel q recebe o valor da formula
        var resultadoFinal = ""

        // determina a sequencia de um numero minino ate um numero maximo
        for (i in 1..10) {

            // val que recebendo o valor digitado sendo multiplicado pelo numero da sequencia
            val product = v1 * i

            // variavel que recebe o valor numero digitado vezes o numero min ate max da sequencia
            val formula = "$v1 * $i = $product"

            // print== imprimir ,ln== linha "imprimi a linha no logcat
            println(formula)

            // resultadoFinal recebe em mais de uma vez o valor da formula havendo uma quebra de linha em toda vez q ela for gerado um resultado criando a lista
            // pois = recebe, + adciona e \n quebra linha logo ele recebe o resultado numa luinha e adciona o outro resultado na outra linha ate acabar o loop
            resultadoFinal += "$formula \n"
        }
        //resultado. text é o textView que recebe o valor de resultado final
        resultado.text = resultadoFinal
    }
}

//termos q poderiam ser facilmente substituidos por receber! Atribuir é o mais correto no mercado
// para ser armazenado
// guardou no
// dentro
// que vai guardar