package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExercicio8Binding

class Exercicio8 : AppCompatActivity() {

    private lateinit var binding: ActivityExercicio8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding = ActivityExercicio8Binding.inflate(layoutInflater)
       setContentView(binding.root)

    }


}