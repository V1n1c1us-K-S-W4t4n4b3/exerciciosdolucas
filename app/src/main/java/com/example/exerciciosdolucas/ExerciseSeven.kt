package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.SimpleStringSplitter
import com.example.exerciciosdolucas.databinding.ActivityExercico7Binding

class Exercicio7 : AppCompatActivity() {

    private lateinit var binding: ActivityExercico7Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercico7Binding.inflate(layoutInflater)
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
