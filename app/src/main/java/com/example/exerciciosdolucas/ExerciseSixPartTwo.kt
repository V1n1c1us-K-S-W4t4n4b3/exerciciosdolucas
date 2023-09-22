package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseSixPartTwoBinding

class ExerciseSixPartTwo : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseSixPartTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseSixPartTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recuperarDados()
        binding.backButton.setOnClickListener { finish() }
    }

    private fun recuperarDados() {

        val fruta1 = intent.getStringExtra("frut1")
        val fruta2 = intent.getStringExtra("frut2")
        val fruta3 = intent.getStringExtra("frut3")
        val fruta4 = intent.getStringExtra("frut4")
        val fruta5 = intent.getStringExtra("frut5")

        binding.textRes1.setText(fruta1)
        binding.res2.setText(fruta2)
        binding.res3.setText(fruta3)
        binding.res4.setText(fruta4)
        binding.res5.setText(fruta5)

    }
}