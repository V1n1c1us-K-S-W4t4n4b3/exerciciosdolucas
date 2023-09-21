package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExercicio12Binding

class Exercicio12 : AppCompatActivity() {
    private lateinit var binding: ActivityExercicio12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio12Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}