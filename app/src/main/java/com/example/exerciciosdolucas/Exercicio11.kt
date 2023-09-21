package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExercicio11Binding

class Exercicio11 : AppCompatActivity() {

    private lateinit var binding: ActivityExercicio11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio11Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}