package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseEightBinding

class ExerciseEight : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseEightBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding = ActivityExerciseEightBinding.inflate(layoutInflater)
       setContentView(binding.root)

    }


}