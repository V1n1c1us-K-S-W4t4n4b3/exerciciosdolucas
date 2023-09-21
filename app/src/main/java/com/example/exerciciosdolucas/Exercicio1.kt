package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.exerciciosdolucas.databinding.ActivityExercicio1Binding

class Exercicio1 : AppCompatActivity() {
    private lateinit var binding: ActivityExercicio1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        binding.calculeteButton.setOnClickListener {
            calcularMostrar()
        }
    }

    fun somar(v1: Double, v2: Double): Double {
        return v1 + v2
    }

    fun subtrair(v1: Double, v2: Double): Double {
        return v1 - v2
    }

    fun multiplicar(v1: Double, v2: Double): Double {
        return v1 * v2
    }

    fun dividir(v1: Double, v2: Double): Double {
        return v1 / v2
    }

    fun calcularMostrar() {
        val editPrimeiro = binding.editnumb1
        val editSegundo = binding.editnumb2
        val textSoma = binding.textSoma
        val textSub = binding.textSub
        val textMult = binding.textMult
        val textDiv = binding.textDiv

        val valor1 = editPrimeiro.text.toString().toDouble()
        val valor2 = editSegundo.text.toString().toDouble()

        val result1 = somar(valor1, valor2)
        textSoma.text = result1.toString()

        val result2 = subtrair(valor1, valor2)
        textSub.text = result2.toString()

        val result3 = multiplicar(valor1, valor2)
        textMult.text = result3.toString()

        val result4 = dividir(valor1, valor2)
        textDiv.text = result4.toString()
    }
}