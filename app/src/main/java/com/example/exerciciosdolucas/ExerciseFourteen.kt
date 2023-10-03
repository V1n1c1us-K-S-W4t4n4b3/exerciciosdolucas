package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exerciciosdolucas.databinding.ActivityExerciseFourteenBinding
import java.text.NumberFormat
import java.util.Locale

class ExerciseFourteen : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseFourteenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseFourteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBack.setOnClickListener { finish() }

        binding.butonClean.setOnClickListener { clear() }

        binding.buttonCalculate.setOnClickListener { calculate() }

    }

    fun validarCampo(v1: Double?): Boolean {

        return v1 != null

    }

    fun clear() {

        binding.textResult.visibility = View.GONE
        binding.tietEditValor.setText("")

    }

    fun formulatTwentyPercent(fraWage: Double): Double {
        return fraWage * 1.2

    }

    fun fTwentPDifference(fraWage: Double): Double {
        return fraWage * 0.2
    }


    fun formulaFifteenPercent(fraWage: Double): Double {
        return fraWage * 1.15

    }

    fun fFifteenPDifference(fraWage: Double): Double {
        return fraWage * 0.15
    }


    fun formulaTenPercent(fraWage: Double): Double {
        return fraWage * 1.10

    }

    fun fTenPDifference(fraWage: Double): Double {
        return fraWage * 0.10
    }


    fun formulaFivePercent(fraWage: Double): Double {
        return fraWage * 1.05

    }

    fun fFivePDifference(fraWage: Double): Double {
        return fraWage * 0.05
    }

    fun frenchLanguage(v1: Double): String {
        val format: NumberFormat = NumberFormat.getInstance(Locale.FRANCE)
        val number: Number? = format.parse(v1.toString())
        val doubleN = number.toString().toDouble()
        val stringN = String.format("%.2f", doubleN)

        return stringN
    }

    fun calculate() {

        val wage = binding.tietEditValor.text.toString().toDoubleOrNull()
        val isWageOk = validarCampo(wage)


        if (isWageOk) {

            val dWage = binding.tietEditValor.text.toString().toDouble()
            val fraWage = frenchLanguage(dWage)

            val percent20 = getString(R.string.twent_percent)
            val percent15 = getString(R.string.fifteen_percent)
            val percent10 = getString(R.string.ten_percent)
            val percent5 = getString(R.string.five_percent)

            val dPercent20 = fTwentPDifference(dWage)
            val sPercent20 = frenchLanguage(dPercent20)

            val dPercent15 = fFifteenPDifference(dWage)
            val sPercent15 = frenchLanguage(dPercent15)

            val dPercent10 = fTenPDifference(dWage)
            val sPercent10 = frenchLanguage(dPercent10)

            val dPercent05 = fFivePDifference(dWage)
            val sPercent05 = frenchLanguage(dPercent05)

            val resultpercent20 = formulatTwentyPercent(dWage)
            val sResult20 = frenchLanguage(resultpercent20)

            val resultpercent15 = formulaFifteenPercent(dWage)
            val sResult15 = frenchLanguage(resultpercent15)

            val resultpercent10 = formulaTenPercent(dWage)
            val sResult10 = frenchLanguage(resultpercent10)

            val resultpercent05 = formulaFivePercent(dWage)
            val sResult05 = frenchLanguage(resultpercent05)

            if (dWage <= 280.00) {
                binding.textResult.visibility = View.VISIBLE

                binding.textResult.text = getString(
                    R.string.result_wage_placeholder,
                    fraWage,
                    percent20,
                    sPercent20,
                    sResult20
                )


            } else if (dWage <= 700.00) {
                binding.textResult.visibility = View.VISIBLE

                binding.textResult.text = getString(
                    R.string.result_wage_placeholder,
                    fraWage,
                    percent15,
                    sPercent15,
                    sResult15
                )

            } else if (dWage <= 1500.00) {
                binding.textResult.visibility = View.VISIBLE

                binding.textResult.text = getString(
                    R.string.result_wage_placeholder,
                    fraWage,
                    percent10,
                    sPercent10,
                    sResult10
                )

            } else if (dWage > 1500.00) {
                binding.textResult.visibility = View.VISIBLE

                binding.textResult.text = getString(
                    R.string.result_wage_placeholder,
                    fraWage,
                    percent5,
                    sPercent05,
                    sResult05
                )
            }

        } else {
            binding.textResult.visibility = View.VISIBLE
            binding.textResult.text = getString(R.string.miss_valor)
        }
    }

}