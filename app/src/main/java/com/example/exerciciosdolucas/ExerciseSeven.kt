package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseSevenBinding

class ExerciseSeven : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseSevenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseSevenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        binding.reversButton.setOnClickListener {

            inverter()
        }
    }

    private fun inverter() {
        val editqualqr = binding.editQualquerCoisa.text
        val reverse = editqualqr.reversed()
        val revertido = reverse
        binding.textInvertido.text = revertido.toString()

    }
}
