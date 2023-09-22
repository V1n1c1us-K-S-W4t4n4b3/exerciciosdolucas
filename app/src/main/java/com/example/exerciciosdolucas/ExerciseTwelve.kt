package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseTwelveBinding

class ExerciseTwelve : AppCompatActivity() {
    private lateinit var binding: ActivityExerciseTwelveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseTwelveBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}