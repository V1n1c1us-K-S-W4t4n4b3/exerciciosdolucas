package com.example.exerciciosdolucas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseEightPartTwoBinding

class ExerciseEightPartTwo : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseEightPartTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseEightPartTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        receptor()

        binding.backButton.setOnClickListener { finish() }

    }

    private fun receptor() {

        val recevPar = intent.getIntegerArrayListExtra("par") ?: ArrayList()

        val recevImp = intent.getIntegerArrayListExtra("impar") ?: ArrayList()

        val evText = binding.everText

        val oddText = binding.oddText

        var resultImp = ""

        var resultPar = ""

        // percorrer o array list
        // para cada item do array list concatenar o resultado final com o item
        for (i in 0..<recevImp.size) {

            val item = recevImp[i]

            resultImp += "\n$item"
        }
        evText.text = resultImp

        for (i in 0..<recevPar.size) {

            val itemPar = recevPar[i]

            resultPar += "\n$itemPar"

        }
        //binding.oddText.text = setText(recevImp).toString()
        oddText.text = resultPar

    }
}