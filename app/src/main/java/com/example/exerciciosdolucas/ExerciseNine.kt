package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseNineBinding

class ExerciseNine : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseNineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExerciseNineBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }



}