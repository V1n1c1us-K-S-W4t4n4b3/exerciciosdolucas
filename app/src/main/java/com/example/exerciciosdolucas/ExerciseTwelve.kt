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

        binding.clearnButton.setOnClickListener { clearn() }
    }

    fun clearn() {

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

        return !n1.isNullOrEmpty() && !n2.isNullOrEmpty() && !n3.isNullOrEmpty() && !n4.isNullOrEmpty() && !n5.isNullOrEmpty()

    }

    fun validarIdade(v1: Int?, v2: Int?, v3: Int?, v4: Int?, v5: Int?): Boolean {

        return v1 != null && v2 != null && v3 != null && v4 != null && v5 != null

    }


    fun addStringList() {

        val nameOne = binding.editName1.text.toString()
        val nametwo = binding.editName2.text.toString()
        val nameThree = binding.editName3.text.toString()
        val nameFour = binding.editName4.text.toString()
        val nameFivi = binding.editName5.text.toString()

        //listName.addAll(arrayOf(nameOne, nametwo, nameThree, nameFour, nameFivi))
        listName.add(nameOne)
        listName.add(nametwo)
        listName.add(nameThree)
        listName.add(nameFour)
        listName.add(nameFivi)
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

    fun media(v1: Int, v2: Int, v3: Int, v4: Int, v5: Int): Int {

        return (v1 + v2 + v3 + v4 + v5) / 5
    }

    fun maior(v1: Int, v2: Int, v3: Int, v4: Int, v5: Int): Int {

        var resultBig = "".toInt()

        for (i in 0..<listInt.size) {

            val item = listInt[i]

            if (item > resultBig) {
                resultBig = item
            }
        }
        return resultBig
        //return maxOf(v1, v2, v3, v4, v5)

    }

    fun menor(v1: Int, v2: Int, v3: Int, v4: Int, v5: Int): Int {

        var resultMin = "".toInt()

        for (i in 0..<listInt.size) {

            val item = listInt[i]

            if (item < resultMin) {
                resultMin = item
            }
        }
        return resultMin

        //return minOf(v1, v2, v3, v4, v5)
    }

    fun concluir() {

        addIntList()
        addStringList()

        val nameOne = binding.editName1.text.toString()
        val nameTwo = binding.editName2.text.toString()
        val nameThree = binding.editName3.text.toString()
        val nameFour = binding.editName4.text.toString()
        val nameFive = binding.editName5.text.toString()

        val idadeOne = binding.editAge1.text.toString().toInt()
        val idadeTwo = binding.editAge2.text.toString().toInt()
        val idadeThree = binding.editAge3.text.toString().toInt()
        val idadeFour = binding.editAge4.text.toString().toInt()
        val idadeFive = binding.editAge5.text.toString().toInt()

        val isNameValidado = validarNames(nameOne, nameTwo, nameThree, nameFour, nameFive)
        val isAgeValidado = validarIdade(idadeOne, idadeTwo, idadeThree, idadeFour, idadeFive)





        if (isAgeValidado && isNameValidado) {


            val resultMaior = maior(idadeOne, idadeTwo, idadeThree, idadeFour, idadeFive).toString()

            val resultMenor = menor(idadeOne, idadeTwo, idadeThree, idadeFour, idadeFive).toString()

            val resultMedium = media(idadeOne, idadeTwo, idadeThree, idadeFour, idadeFive).toString()

            val stringMaior = String.format("%.3f", resultMaior)

            if (resultMaior == idadeOne.toString()) {

                binding.textOld.text = nameOne + resultMaior
            } else if (resultMaior == idadeTwo.toString()) {

                binding.textOld.text = nameTwo + resultMaior
            } else if (resultMaior == idadeThree.toString()) {

                binding.textOld.text = nameThree + resultMaior
            } else if (resultMaior == idadeFour.toString()) {

                binding.textOld.text = nameFour + resultMaior
            } else if (resultMaior == idadeFive.toString()) {

                binding.textOld.text = nameOne + resultMaior
            }

            binding.textAviso.visibility = View.GONE

        } else {

            binding.textAviso.visibility = View.VISIBLE
        }


    }

}