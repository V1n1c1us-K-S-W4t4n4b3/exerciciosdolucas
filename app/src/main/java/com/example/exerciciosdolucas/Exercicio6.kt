package com.example.exerciciosdolucas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExercicio6Binding

class Exercicio6 : AppCompatActivity() {

    private lateinit var binding: ActivityExercicio6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicio6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConcluir.setOnClickListener {
            val concluir = Intent(this, ConclusaoExercicio6::class.java)
            startActivity(concluir)
        }

        binding.buttonConcluir. setOnClickListener {
            listaPronta() }
    }

    private fun listaPronta() {

        val fru1 = binding.editFruta1.text.toString()
        val fru2 = binding.editFruta2.text.toString()
        val fru3 = binding.editFruta3.text.toString()
        val fru4 = binding.editFruta4.text.toString()
        val fru5 = binding.editFruta5.text.toString()

        val intent = Intent(this, ConclusaoExercicio6::class.java)
        intent.putExtra("frut1",fru1,)
        intent.putExtra("frut2",fru2)
        intent.putExtra("frut3",fru3)
        intent.putExtra("frut4",fru4)
        intent.putExtra("frut5",fru5)

        startActivity(intent)
    }

}