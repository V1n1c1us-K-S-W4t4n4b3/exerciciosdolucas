package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseFiveBinding
import java.text.NumberFormat
import java.util.Locale

class ExerciseFive : AppCompatActivity() {
    private lateinit var binding: ActivityExerciseFiveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseFiveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        binding.calculeteButton.setOnClickListener {

            converter()
        }
    }

    fun converter() {
        val textCent = binding.textCentimetro
        val editpolega = binding.editPolegada
        val formatPolega: NumberFormat = NumberFormat.getInstance(Locale.FRANCE)
        val numbPolegada: Number = formatPolega.parse(editpolega.text.toString())
        val dpolegada = numbPolegada.toDouble()
        val formula = dpolegada / 0.3937
        textCent.text = String.format("%.3f", formula)
    }
}