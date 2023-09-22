package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseElevenBinding

class ExerciseEleven : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseElevenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseElevenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}