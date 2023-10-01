package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exerciciosdolucas.databinding.ActivityExerciseThirteenBinding

class ExerciseThirteen : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseThirteenBinding

    private val listName = mutableListOf<String>()

    private val listAltura = mutableListOf<Double>()

    private val listPeso = mutableListOf<Double>()

    private val listIMC = mutableListOf<Double>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseThirteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        binding.cleanButton.setOnClickListener { clear() }

        //binding.concluButton.setOnClickListener { concluir }

    }

    fun clear() {

        binding.editName1.setText("")
        binding.editName2.setText("")
        binding.editName3.setText("")
        binding.editName4.setText("")
        binding.editName5.setText("")

        binding.editAltura1.setText("")
        binding.editAltura2.setText("")
        binding.editAltura3.setText("")
        binding.editAltura4.setText("")
        binding.editAltura5.setText("")

        binding.editPeso1.setText("")
        binding.editPeso2.setText("")
        binding.editPeso3.setText("")
        binding.editPeso4.setText("")
        binding.editPeso5.setText("")

        binding.result1.visibility = View.GONE
        binding.result2.visibility = View.GONE
        binding.result3.visibility = View.GONE
        binding.result4.visibility = View.GONE
        binding.result5.visibility = View.GONE
    }

    fun validarName(n1: String?, n2: String?, n3: String?, n4: String?, n5: String?): Boolean {

        return !n1.isNullOrEmpty() && !n2.isNullOrEmpty() && !n3.isNullOrEmpty()
                && !n4.isNullOrEmpty() && !n5.isNullOrEmpty()
    }

    fun validarAltura(a1: Double?, a2: Double?, a3: Double?, a4: Double?, a5: Double?): Boolean {

        return a1 != null && a2 != null && a3 != null && a4 != null && a5 != null
    }

    fun validarPeso(p1: Double?, p2: Double?, p3: Double?, p4: Double?, p5: Double?): Boolean {

        return p1 != null && p2 != null && p3 != null && p4 != null && p5 != null
    }

    fun addListName() {

        val nameOne = binding.editName1.text.toString()
        val nameTwo = binding.editName1.text.toString()
        val nameThree = binding.editName1.text.toString()
        val nameFour = binding.editName1.text.toString()
        val nameFive = binding.editName1.text.toString()

        listName.add(nameOne)
        listName.add(nameTwo)
        listName.add(nameThree)
        listName.add(nameFour)
        listName.add(nameFive)
    }

    fun addListAltura() {

        val alturaOne = binding.editAltura1.text.toString().toDouble()
        val alturaTwo = binding.editAltura2.text.toString().toDouble()
        val alturaThree = binding.editAltura3.text.toString().toDouble()
        val alturaFour = binding.editAltura4.text.toString().toDouble()
        val alturaFive = binding.editAltura5.text.toString().toDouble()

        listAltura.add(alturaOne)
        listAltura.add(alturaTwo)
        listAltura.add(alturaThree)
        listAltura.add(alturaFour)
        listAltura.add(alturaFive)
    }

    fun addListPeso() {

        val pesoOne = binding.editPeso1.text.toString().toDouble()
        val pesoTwo = binding.editPeso2.text.toString().toDouble()
        val pesoThree = binding.editPeso3.text.toString().toDouble()
        val pesoFour = binding.editPeso4.text.toString().toDouble()
        val pesoFive = binding.editPeso5.text.toString().toDouble()

        listPeso.add(pesoOne)
        listPeso.add(pesoTwo)
        listPeso.add(pesoThree)
        listPeso.add(pesoFour)
        listPeso.add(pesoFive)
    }

    fun formulaIMC(
        a1: Double,
        a2: Double,
        a3: Double,
        a4: Double,
        a5: Double,
        p1: Double,
        p2: Double,
        p3: Double,
        p4: Double,
        p5: Double,
    ): Double {

        addListName()

        val alturaOne = binding.editAltura1.text.toString().toDouble()
        val alturaTwo = binding.editAltura2.text.toString().toDouble()
        val alturaThree = binding.editAltura3.text.toString().toDouble()
        val alturaFour = binding.editAltura4.text.toString().toDouble()
        val alturaFive = binding.editAltura5.text.toString().toDouble()

        val pesoOne = binding.editPeso1.text.toString().toDouble()
        val pesoTwo = binding.editPeso2.text.toString().toDouble()
        val pesoThree = binding.editPeso3.text.toString().toDouble()
        val pesoFour = binding.editPeso4.text.toString().toDouble()
        val pesoFive = binding.editPeso5.text.toString().toDouble()

        val formula1 = pesoOne / (alturaOne * alturaOne)
        val formula2 = pesoTwo / (alturaTwo * alturaTwo)
        val formula3 = pesoThree / (alturaThree * alturaThree)
        val formula4 = pesoFour / (alturaFour * alturaFour)
        val formula5 = pesoFive / (alturaFive * alturaFive)

        val result = 0

        if (formula1 < 19){

            binding.result1.text = getText(R.string.name_lean_placeholders, , formula1.toString().toDouble())
        }


    }
}