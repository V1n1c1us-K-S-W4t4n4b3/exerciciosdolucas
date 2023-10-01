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



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseThirteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        binding.cleanButton.setOnClickListener { clear() }

        binding.concluButton.setOnClickListener { concluir() }

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


        val nameOne = binding.tietName1.text.toString()
        val nameTwo = binding.tietName2.text.toString()
        val nameThree = binding.tietName3.text.toString()
        val nameFour = binding.tietName4.text.toString()
        val nameFive = binding.tietName5.text.toString()

        listName.add(nameOne)
        listName.add(nameTwo)
        listName.add(nameThree)
        listName.add(nameFour)
        listName.add(nameFive)
    }

    fun addListAltura() {


        val alturaOne = binding.tietAltura1.text.toString().toDouble()
        val alturaTwo = binding.tietAltura2.text.toString().toDouble()
        val alturaThree = binding.tietAltura3.text.toString().toDouble()
        val alturaFour = binding.tietAltura4.text.toString().toDouble()
        val alturaFive = binding.tietAltura5.text.toString().toDouble()

        listAltura.add(alturaOne)
        listAltura.add(alturaTwo)
        listAltura.add(alturaThree)
        listAltura.add(alturaFour)
        listAltura.add(alturaFive)
    }

    fun addListPeso() {


        val pesoOne = binding.tietPeso1.text.toString().toDouble()
        val pesoTwo = binding.tietPeso2.text.toString().toDouble()
        val pesoThree = binding.tietPeso3.text.toString().toDouble()
        val pesoFour = binding.tietPeso4.text.toString().toDouble()
        val pesoFive = binding.tietPeso5.text.toString().toDouble()

        listPeso.add(pesoOne)
        listPeso.add(pesoTwo)
        listPeso.add(pesoThree)
        listPeso.add(pesoFour)
        listPeso.add(pesoFive)
    }

    fun clear() {

        binding.tietName1.setText("")
        binding.tietName2.setText("")
        binding.tietName3.setText("")
        binding.tietName4.setText("")
        binding.tietName5.setText("")

        binding.tietAltura1.setText("")
        binding.tietAltura2.setText("")
        binding.tietAltura3.setText("")
        binding.tietAltura4.setText("")
        binding.tietAltura5.setText("")

        binding.tietPeso1.setText("")
        binding.tietPeso2.setText("")
        binding.tietPeso3.setText("")
        binding.tietPeso4.setText("")
        binding.tietPeso5.setText("")

        binding.result1.visibility = View.GONE
        binding.result2.visibility = View.GONE
        binding.result3.visibility = View.GONE
        binding.result4.visibility = View.GONE
        binding.result5.visibility = View.GONE
    }

    fun calculateIMC(): List<Double> {

        if (listPeso.isEmpty() || listAltura.isEmpty()) {
            return mutableListOf()
        }


        val resultado = mutableListOf<Double>()

        for (i in 0 ..<listName.size) {

            val peso = listPeso[i]
            val altura = listAltura[i]

            val imcResult = peso / (altura*altura)

            resultado.add(imcResult)
        }
        return resultado

    }

    fun concluir() {


        val nameOne = binding.tietName1.text.toString()
        val nameTwo = binding.tietName2.text.toString()
        val nameThree = binding.tietName3.text.toString()
        val nameFour = binding.tietName4.text.toString()
        val nameFive = binding.tietName5.text.toString()

        val alturaOne = binding.tietAltura1.text.toString().toDoubleOrNull()
        val alturaTwo = binding.tietAltura2.text.toString().toDoubleOrNull()
        val alturaThree = binding.tietAltura3.text.toString().toDoubleOrNull()
        val alturaFour = binding.tietAltura4.text.toString().toDoubleOrNull()
        val alturaFive = binding.tietAltura5.text.toString().toDoubleOrNull()

        val pesoOne = binding.tietPeso1.text.toString().toDoubleOrNull()
        val pesoTwo = binding.tietPeso2.text.toString().toDoubleOrNull()
        val pesoThree = binding.tietPeso3.text.toString().toDoubleOrNull()
        val pesoFour = binding.tietPeso4.text.toString().toDoubleOrNull()
        val pesoFive = binding.tietPeso5.text.toString().toDoubleOrNull()

        val isValidoAltura =
            validarAltura(alturaOne, alturaTwo, alturaThree, alturaFour, alturaFive)
        val isValidoPeso = validarPeso(pesoOne, pesoTwo, pesoThree, pesoFour, pesoFive)
        val isValidoName = validarName(nameOne, nameTwo, nameThree, nameFour, nameFive)


        if (isValidoAltura && isValidoPeso && isValidoName) {

            addListName()
            addListAltura()
            addListPeso()
            calculateIMC()

            val result1 = calculateIMC()[0]
            val result2 =calculateIMC()[1]
            val result3 =calculateIMC()[2]
            val result4 =calculateIMC()[3]
            val result5 =calculateIMC()[4]

            val resultString1 = String.format("%.3f", result1)
            val resultString2 = String.format("%.3f", result2)
            val resultString3 = String.format("%.3f", result3)
            val resultString4 = String.format("%.3f", result4)
            val resultString5 = String.format("%.3f", result5)

            if (result1 < 18.5) {
                binding.result1.text =
                    getString(R.string.name_lean_placeholders, nameOne, resultString1)

                binding.result1.visibility = View.VISIBLE

            } else if (result1 == 18.5 || result1 < 25) {
                binding.result1.text =
                    getString(R.string.name_ideal_weight_placeholders, nameOne, resultString1)

                binding.result1.visibility = View.VISIBLE

            } else if (result1 > 25) {
                binding.result1.text =
                    getString(R.string.name_fat_placeholders, nameOne, resultString1)

                binding.result1.visibility = View.VISIBLE
            }


            if (result2 < 18.5) {
                binding.result2.text =
                    getString(R.string.name_lean_placeholders, nameTwo, resultString2)

                binding.result2.visibility = View.VISIBLE

            } else if (result2 == 18.5 || result2 < 25) {
                binding.result2.text =
                    getString(R.string.name_ideal_weight_placeholders, nameTwo, resultString2)

                binding.result2.visibility = View.VISIBLE

            } else if (result2 > 25) {
                binding.result2.text =
                    getString(R.string.name_fat_placeholders, nameTwo, resultString2)

                binding.result2.visibility = View.VISIBLE
            }


            if (result3 < 18.5) {
                binding.result3.text =
                    getString(R.string.name_lean_placeholders, nameThree, resultString3)

                binding.result3.visibility = View.VISIBLE

            } else if (result3 == 18.5 || result3 < 25) {
                binding.result3.text =
                    getString(R.string.name_ideal_weight_placeholders, nameThree, resultString3)

                binding.result3.visibility = View.VISIBLE

            } else if (result3 > 25) {
                binding.result3.text =
                    getString(R.string.name_fat_placeholders, nameThree, resultString3)

                binding.result3.visibility = View.VISIBLE
            }


            if (result4 < 18.5) {
                binding.result4.text =
                    getString(R.string.name_lean_placeholders, nameFour, resultString4)

                binding.result4.visibility = View.VISIBLE

            } else if (result4 == 18.5 || result4 < 25) {
                binding.result4.text =
                    getString(R.string.name_ideal_weight_placeholders, nameFour, resultString4)

                binding.result4.visibility = View.VISIBLE

            } else if (result4 > 25) {
                binding.result4.text =
                    getString(R.string.name_fat_placeholders, nameFour, resultString4)

                binding.result4.visibility = View.VISIBLE
            }


            if (result5 < 18.5) {
                binding.result5.text =
                    getString(R.string.name_lean_placeholders, nameFive, resultString5)

                binding.result5.visibility = View.VISIBLE

            } else if (result5 == 18.5 || result5 < 25) {
                binding.result5.text =
                    getString(R.string.name_ideal_weight_placeholders, nameFive, resultString5)

                binding.result5.visibility = View.VISIBLE

            } else if (result5 > 25) {
                binding.result5.text =
                    getString(R.string.name_fat_placeholders, nameFive, resultString5)

                binding.result5.visibility = View.VISIBLE
            }

        } else {

            binding.result1.text = getString(R.string.incompleted)
            binding.result1.visibility = View.VISIBLE
            binding.result2.visibility = View.GONE
            binding.result3.visibility = View.GONE
            binding.result4.visibility = View.GONE
            binding.result5.visibility = View.GONE
        }

    }

}