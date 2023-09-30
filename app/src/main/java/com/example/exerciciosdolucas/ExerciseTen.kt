package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exerciciosdolucas.databinding.ActivityExerciseTenBinding

// usuario vai digitar os nomes
// usuario vai apertar o botao concluir
// app vai validar os campos
// app vai enviar as strings para a lista de string
// app vai descobrir qual string é maior e mandar para o textView

class ExerciseTen : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseTenBinding

    private var contadorDeErrors: Int = 0

    private val listName = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExerciseTenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        binding.concluirButton.setOnClickListener { concluir() }

        binding.cleanButton.setOnClickListener { clearn() }
    }

    fun validarCampos(v1: String?, v2: String?, v3: String?, v4: String?, v5: String?): Boolean {

        return !v1.isNullOrEmpty() && !v2.isNullOrEmpty() && !v3.isNullOrEmpty() && !v4.isNullOrEmpty() && !v5.isNullOrEmpty()
    }


    fun clearn() {

        binding.DigitNameEdit1.setText("")
        binding.DigitNameEdit2.setText("")
        binding.DigitNameEdit3.setText("")
        binding.DigitNameEdit4.setText("")
        binding.DigitNameEdit5.setText("")
        binding.bigNameText.setText(R.string.bigName)
        binding.textError404.visibility = View.GONE

    }

    fun contadorderros() {

        contadorDeErrors++

        if (contadorDeErrors == 5) {

            val corDeBurro = resources.getColor(R.color.red)

            binding.DigitNameEdit1.setText("")
            binding.DigitNameEdit1.setHintTextColor(corDeBurro)
            binding.DigitNameEdit1.setHint(R.string.punishment)

            binding.DigitNameEdit2.setText("")
            binding.DigitNameEdit2.setHintTextColor(corDeBurro)
            binding.DigitNameEdit2.setHint(R.string.punishment)

            binding.DigitNameEdit3.setText("")
            binding.DigitNameEdit3.setHintTextColor(corDeBurro)
            binding.DigitNameEdit3.setHint(R.string.punishment)

            binding.DigitNameEdit4.setText("")
            binding.DigitNameEdit4.setHintTextColor(corDeBurro)
            binding.DigitNameEdit4.setHint(R.string.punishment)

            binding.DigitNameEdit5.setText("")
            binding.DigitNameEdit5.setHintTextColor(corDeBurro)
            binding.DigitNameEdit5.setHint(R.string.punishment)

            contadorDeErrors = 0

            binding.textError404.visibility = View.GONE

        }

    }


    //fun maior(v1: String, v2: String, v3: String, v4: String, v5: String): String {

    // return maxOf(v1, v2, v3, v4, v5)

    // }
    fun addStringList() {

        val nameOne = binding.DigitNameEdit1.text.toString()
        val nametwo = binding.DigitNameEdit2.text.toString()
        val nameThree = binding.DigitNameEdit3.text.toString()
        val nameFour = binding.DigitNameEdit4.text.toString()
        val nameFivi = binding.DigitNameEdit5.text.toString()

        //listName.addAll(arrayOf(nameOne, nametwo, nameThree, nameFour, nameFivi))
        listName.add(nameOne)
        listName.add(nametwo)
        listName.add(nameThree)
        listName.add(nameFour)
        listName.add(nameFivi)

    }

    fun obterStringList(): List<String> {

        return listName
    }


    fun concluir() {

        val nameOne = binding.DigitNameEdit1.text.toString()
        val nametwo = binding.DigitNameEdit2.text.toString()
        val nameThree = binding.DigitNameEdit3.text.toString()
        val nameFour = binding.DigitNameEdit4.text.toString()
        val nameFivi = binding.DigitNameEdit5.text.toString()


        val isCamposValidados = validarCampos(nameOne, nametwo, nameThree, nameFour, nameFivi)




        if (isCamposValidados) {

            // eu tenho a lista
            // criar uma variavel para guardar a maior string da lista
            // percorrer a lista com for
            // para cada item comparar se o length da string é o maior
            // se for o maior substituir a string anterior

            addStringList()

            var maior = ""

            for (i in 0..<listName.size) {

                val item = listName[i]

                if (item.length > maior.length) {
                    maior = item

                }
            }

            //val listaDeStrings = obterStringList()
            //val maiorString = listaDeStrings.maxByOrNull { it.length }
            binding.bigNameText.text = maior

            binding.textError404.visibility = View.GONE

        } else {
            binding.textError404.visibility = View.VISIBLE

            contadorderros()
        }

    }

}


//val nameOneString = binding.DigitNameEdit1.text.toString()
//val nameTwoString = binding.DigitNameEdit2.text.toString()
//val nameThreeString = binding.DigitNameEdit3.text.toString()
//val nameFourString = binding.DigitNameEdit4.text.toString()
//val nameFiviString = binding.DigitNameEdit5.text.toString()