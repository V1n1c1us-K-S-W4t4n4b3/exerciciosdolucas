package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseThreeBinding

class ExerciseThree : AppCompatActivity() {
    private lateinit var binding: ActivityExerciseThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        binding.calculeteButton.setOnClickListener {
            converter()
        }
    }
    fun converter() {

        val fahrenheit = binding.textFahrenheit
        val celsius = binding.editCelsius
        val celsiusEmNumb = celsius.text.toString().toDouble()
        val formula = (celsiusEmNumb * 9 / 5) + 32
        fahrenheit.text = formula.toString()

    }
}