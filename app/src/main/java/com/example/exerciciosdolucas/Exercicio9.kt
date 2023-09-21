package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExercicio9Binding

class Exercicio9 : AppCompatActivity() {

    private lateinit var binding: ActivityExercicio9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExercicio9Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }



}