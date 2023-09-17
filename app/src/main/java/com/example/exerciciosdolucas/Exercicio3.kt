package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExercicio3Binding

class Exercicio3 : AppCompatActivity() {
    private lateinit var binding: ActivityExercicio3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalcular.setOnClickListener {
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