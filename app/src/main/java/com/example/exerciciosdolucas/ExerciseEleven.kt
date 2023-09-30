package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exerciciosdolucas.databinding.ActivityExerciseElevenBinding


// usuario digita palavra
// usuarioa clica em concluir
// app
class ExerciseEleven : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseElevenBinding

    private var contadorDeErrors: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExerciseElevenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.concluirButton.setOnClickListener { imparMaiusc() }

        binding.clearnButton.setOnClickListener { clearn() }
    }

    fun contadorderros() {

        contadorDeErrors++

        if (contadorDeErrors == 5) {

            val corDeBurro = resources.getColor(R.color.red)

            binding.wordEdit.setText("")
            binding.wordEdit.setHintTextColor(corDeBurro)
            binding.wordEdit.setHint(R.string.vacilao)
        }
    }

    fun validarCampo(v1: String?): Boolean {

        return !v1.isNullOrEmpty()

    }

    fun clearn() {

        binding.resultText.setText(R.string.resultNameText)
        binding.wordEdit.setText("")

    }

    fun imparMaiusc() {

        val resultado = StringBuilder()
        val editPalavra = binding.wordEdit.text.toString()

        val isCampoValidado = validarCampo(editPalavra)

        if (isCampoValidado) {

            for ((i, caracter) in editPalavra.withIndex()) {

                if (i % 2 == 0) {

                    resultado.append(caracter.uppercaseChar())
                } else {
                    resultado.append(caracter)
                }
            }
            binding.textAviso.visibility = View.GONE
            binding.resultText.text = resultado.toString()


        } else {
            binding.textAviso.visibility = View.VISIBLE

            contadorderros()

        }
    }
}