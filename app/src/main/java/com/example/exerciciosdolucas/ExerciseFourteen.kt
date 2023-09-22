package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseFourteenBinding

class ExerciseFourteen : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseFourteenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseFourteenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }



}