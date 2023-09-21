package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExercicio10Binding

class Exercicio10 : AppCompatActivity() {
    private lateinit var binding: ActivityExercicio10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExercicio10Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }



}