package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exerciciosdolucas.databinding.ActivityExerciseNineBinding

class ExerciseNine : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseNineBinding
    private var contadorDeErrors: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExerciseNineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        binding.concluirButton.setOnClickListener { concluir() }

        binding.cleanButton.setOnClickListener { clear() }
    }


    // declarando funçao validarCampos com 5 parametros todos do tipo "Int?" e retornando um valor do tipo "Boolean"
    fun valirarCampos(v1: Int?, v2: Int?, v3: Int?, v4: Int?, v5: Int?): Boolean {

        return v1 != null && v2 != null && v3 != null && v4 != null && v5 != null
    }

    fun clear() {

        binding.editFirstNumb.setText("")
        binding.editSecondNumb.setText("")
        binding.editThirdNumb.setText("")
        binding.editfFurthNumb.setText("")
        binding.editFifthNumb.setText("")
        binding.textBigNumb.text = getString(R.string.bigger)
        binding.textSmallNumb.text = getString(R.string.smaller)
        binding.textAverNumb.text = getString(R.string.mediaNumber)
    }

    fun contadorderros() {

        contadorDeErrors++

        if (contadorDeErrors == 5) {

            val corDeBurro = resources.getColor(R.color.red)

            binding.editFirstNumb.setText("")
            binding.editFirstNumb.setHintTextColor(corDeBurro)
            binding.editFirstNumb.setHint(R.string.punishment)

            binding.editSecondNumb.setText("")
            binding.editSecondNumb.setHintTextColor(corDeBurro)
            binding.editSecondNumb.setHint(R.string.punishment)

            binding.editThirdNumb.setText("")
            binding.editThirdNumb.setHintTextColor(corDeBurro)
            binding.editThirdNumb.setHint(R.string.punishment)

            binding.editfFurthNumb.setText("")
            binding.editfFurthNumb.setHintTextColor(corDeBurro)
            binding.editfFurthNumb.setHint(R.string.punishment)

            binding.editFifthNumb.setText("")
            binding.editFifthNumb.setHintTextColor(corDeBurro)
            binding.editFifthNumb.setHint(R.string.punishment)

            contadorDeErrors = 0

            binding.textError404.visibility = View.GONE

        }

    }

    fun media(v1: Int, v2: Int, v3: Int, v4: Int, v5: Int): Int {

        return (v1 + v2 + v3 + v4 + v5) / 5
    }

    fun maior(v1: Int, v2: Int, v3: Int, v4: Int, v5: Int): Int {

        return maxOf(v1, v2, v3, v4, v5)

    }

    fun menor(v1: Int, v2: Int, v3: Int, v4: Int, v5: Int): Int {

        return minOf(v1, v2, v3, v4, v5)
    }

    fun concluir() {

        val numbOne = binding.editFirstNumb.text.toString().toIntOrNull()
        val numbTwo = binding.editSecondNumb.text.toString().toIntOrNull()
        val numbThree = binding.editThirdNumb.text.toString().toIntOrNull()
        val numbFour = binding.editfFurthNumb.text.toString().toIntOrNull()
        val numbFive = binding.editFifthNumb.text.toString().toIntOrNull()

        val bigNumb = binding.textBigNumb
        val smallNumb = binding.textSmallNumb
        val averNumb = binding.textAverNumb

        // chamando funçao validarCampos e guardando seu retorno na variavel isCamposVlalidados
        val isCamposVlaidados = valirarCampos(numbOne, numbTwo, numbThree, numbFour, numbFive)

        if (isCamposVlaidados) {

            val numbIntOne = binding.editFirstNumb.text.toString().toInt()
            val numbIntTwo = binding.editSecondNumb.text.toString().toInt()
            val numbIntThree = binding.editThirdNumb.text.toString().toInt()
            val numbIntFour = binding.editfFurthNumb.text.toString().toInt()
            val numbIntFive = binding.editFifthNumb.text.toString().toInt()

            // todo: efetuar os calculos e passar para os textViews
            val isMedia = media(numbIntOne, numbIntTwo, numbIntThree, numbIntFour, numbIntFive)
            averNumb.text = getString(R.string.mediaresult, isMedia.toString())

            val isMaior = maior(numbIntOne, numbIntTwo, numbIntThree, numbIntFour, numbIntFive)
            bigNumb.text = getString(R.string.bigresult, isMaior.toString())

            val isMenor = menor(numbIntOne, numbIntTwo, numbIntThree, numbIntFour, numbIntFive)
            smallNumb.text = getString(R.string.smallresult, isMenor.toString())

            binding.textError404.visibility = View.GONE

        } else {
            // todo: exibir uma msg dizendo que há algum campo n preenchido
            binding.textError404.visibility = View.VISIBLE

            contadorderros()

        }

    }

}