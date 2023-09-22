package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseTenBinding

class ExerciseTen : AppCompatActivity() {
    private lateinit var binding: ActivityExerciseTenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExerciseTenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }



}