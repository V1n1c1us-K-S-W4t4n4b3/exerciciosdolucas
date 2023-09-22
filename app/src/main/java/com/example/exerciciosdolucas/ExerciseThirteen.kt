package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseThirteenBinding

class ExerciseThirteen : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseThirteenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseThirteenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }



}