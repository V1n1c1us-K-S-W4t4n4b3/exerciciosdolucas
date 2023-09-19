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

        val editReal = binding.editReal
        val formatReal: NumberFormat = NumberFormat.getInstance(Locale.FRANCE)
        val numberDolar: Number = formatReal.parse(editReal.text.toString())
        val dReal = numberDolar.toDouble()
        val editCotacao = binding.editCotaO
        val formatcotacao: NumberFormat = NumberFormat.getInstance(Locale.FRANCE)
        val numberCotacao: Number = formatcotacao.parse(editCotacao.text.toString())
        val dcotacao = numberCotacao.toDouble()
        val formula = dReal / dcotacao
        val Dolar = binding.textDolar
        Dolar.text = String.format("%.2f", formula)

    }
}