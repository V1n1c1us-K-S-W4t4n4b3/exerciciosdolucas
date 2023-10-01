package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exerciciosdolucas.databinding.ActivityExerciseTwelveBinding

class ExerciseTwelve : AppCompatActivity() {
    private lateinit var binding: ActivityExerciseTwelveBinding

    private val listName = mutableListOf<String>()

    private val listInt = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseTwelveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        binding.ConcluButton.setOnClickListener { concluir() }

        binding.clearnButton.setOnClickListener { clear() }
    }

    fun clear() {

        binding.editName1.setText("")
        binding.editName2.setText("")
        binding.editName3.setText("")
        binding.editName4.setText("")
        binding.editName5.setText("")
        binding.editAge1.setText("")
        binding.editAge2.setText("")
        binding.editAge3.setText("")
        binding.editAge4.setText("")
        binding.editAge5.setText("")
        binding.textNew.setText(R.string.textNewPerson)
        binding.textOld.setText(R.string.textOldPerson)
        binding.textMedium.setText(R.string.textMediumPerson)
        binding.textAviso.visibility = View.GONE

    }

    fun validarNames(n1: String?, n2: String?, n3: String?, n4: String?, n5: String?): Boolean {

        return !n1.isNullOrEmpty() && !n2.isNullOrEmpty() && !n3.isNullOrEmpty()
                && !n4.isNullOrEmpty() && !n5.isNullOrEmpty()

    }

    fun validarIdade(v1: Int?, v2: Int?, v3: Int?, v4: Int?, v5: Int?): Boolean {

        return v1 != null && v2 != null && v3 != null && v4 != null && v5 != null

    }


    fun addStringList() {

        val nameOne = binding.editName1.text.toString()
        val nameTwo = binding.editName2.text.toString()
        val nameThree = binding.editName3.text.toString()
        val nameFour = binding.editName4.text.toString()
        val nameFive = binding.editName5.text.toString()

        //listName.addAll(arrayOf(nameOne, nametwo, nameThree, nameFour, nameFivi))
        listName.add(nameOne)
        listName.add(nameTwo)
        listName.add(nameThree)
        listName.add(nameFour)
        listName.add(nameFive)

    }

    fun addIntList() {

        val idadeOne = binding.editAge1.text.toString().toInt()
        val idadeTwo = binding.editAge2.text.toString().toInt()
        val idadeThree = binding.editAge3.text.toString().toInt()
        val idadeFour = binding.editAge4.text.toString().toInt()
        val idadeFive = binding.editAge5.text.toString().toInt()

        listInt.add(idadeOne)
        listInt.add(idadeTwo)
        listInt.add(idadeThree)
        listInt.add(idadeFour)
        listInt.add(idadeFive)

    }

    fun media(v1: Int?, v2: Int?, v3: Int?, v4: Int?, v5: Int?): Int {

        if (v1 != null && v2 != null && v3 != null && v4 != null && v5 != null) {
            return (v1 + v2 + v3 + v4 + v5) / 5
        }
        return 0
    }

    fun media(): Int {

        if (listInt.isEmpty()) {
            return 0
        }

        var soma = 0

        for (i in 0..<listInt.size) {

            val item = listInt[i]

            soma += item
        }
        // poderia utilizar "return soma / listInt.size"
        val resultMedia = soma / listInt.size
        return resultMedia
    }


    fun maior(v1: Int, v2: Int, v3: Int, v4: Int, v5: Int): Int {
        return maxOf(v1, v2, v3, v4, v5)
    }

    fun maior(): Int {

        if (listInt.isEmpty()) {
            return 0
        }

        var resultBig = 0

        for (i in 0..<listInt.size) {

            val item = listInt[i]

            if (item > resultBig) {
                resultBig = item
            }
        }

        return resultBig
    }

    fun menor(v1: Int, v2: Int, v3: Int, v4: Int, v5: Int): Int {


        return minOf(v1, v2, v3, v4, v5)
    }

    fun menor(): Int {

        if (listInt.isEmpty()) {
            return 0
        }

        var resultMin = listInt[0]

        for (i in 0..<listInt.size) {

            val item = listInt[i]

            if (item < resultMin) {
                resultMin = item
            }
        }
        return resultMin

    }

    fun concluir() {

        val nameOne = binding.editName1.text.toString()
        val nameTwo = binding.editName2.text.toString()
        val nameThree = binding.editName3.text.toString()
        val nameFour = binding.editName4.text.toString()
        val nameFive = binding.editName5.text.toString()

        val idadeOne = binding.editAge1.text.toString().toIntOrNull()
        val idadeTwo = binding.editAge2.text.toString().toIntOrNull()
        val idadeThree = binding.editAge3.text.toString().toIntOrNull()
        val idadeFour = binding.editAge4.text.toString().toIntOrNull()
        val idadeFive = binding.editAge5.text.toString().toIntOrNull()

        val isNameValidado = validarNames(nameOne, nameTwo, nameThree, nameFour, nameFive)
        val isAgeValidado = validarIdade(idadeOne, idadeTwo, idadeThree, idadeFour, idadeFive)

        if (isAgeValidado && isNameValidado) {

            addIntList()
            addStringList()

            val resultMaior = maior()
            val resultMenor = menor()
            val resultMedium = media().toString()

            if (resultMaior == idadeOne) {
                binding.textOld.text =
                    getString(R.string.name_age_old_placeholders, nameOne, resultMaior.toString())
            } else if (resultMaior == idadeTwo) {
                binding.textOld.text =
                    getString(R.string.name_age_old_placeholders, nameTwo, resultMaior.toString())
            } else if (resultMaior == idadeThree) {
                binding.textOld.text =
                    getString(R.string.name_age_old_placeholders, nameThree, resultMaior.toString())
            } else if (resultMaior == idadeFour) {
                binding.textOld.text =
                    getString(R.string.name_age_old_placeholders, nameFour, resultMaior.toString())
            } else if (resultMaior == idadeFive) {
                binding.textOld.text =
                    getString(R.string.name_age_old_placeholders, nameOne, resultMaior.toString())
            }

            if (resultMenor == idadeOne) {
                binding.textNew.text =
                    getString(R.string.name_age_new_placeholders, nameOne, resultMenor.toString())
            } else if (resultMenor == idadeTwo) {
                binding.textNew.text =
                    getString(R.string.name_age_new_placeholders, nameTwo, resultMenor.toString())
            } else if (resultMenor == idadeThree) {
                binding.textNew.text =
                    getString(R.string.name_age_new_placeholders, nameThree, resultMenor.toString())
            } else if (resultMenor == idadeFour) {
                binding.textNew.text =
                    getString(R.string.name_age_new_placeholders, nameFour, resultMenor.toString())
            } else if (resultMenor == idadeFive) {
                binding.textNew.text =
                    getString(R.string.name_age_new_placeholders, nameFive, resultMenor.toString())
            }

            binding.textMedium.text = getString(R.string.average_age_placeholders, resultMedium)

            binding.textAviso.visibility = View.GONE

        } else {
            binding.textAviso.visibility = View.VISIBLE
        }

    }

}