package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExercicio4Binding
import java.text.NumberFormat
import java.util.Locale

class Exercicio4 : AppCompatActivity() {
    private lateinit var binding: ActivityExercicio4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalcular.setOnClickListener {
            converter()
        }
    }

    private fun converter() {

        val editDolar = binding.editDolar
        val formatDolar: NumberFormat = NumberFormat.getInstance(Locale.FRANCE)
        val numberDolar: Number = formatDolar.parse(editDolar.text.toString())
        val dDolar = numberDolar.toDouble()
        val formula = dDolar * 4.87
        val reais = binding.textReais
        reais.text = String.format("%.3f", formula)

    }
}