package com.example.exerciciosdolucas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityExerciseEightPartOneBinding

class ExerciseEightPartOne : AppCompatActivity() {

    // Componentes:
    // editText = editNumberlist = serve para obter o texto que o usuario digitou em formato string
    // textview = textNumbList = serve para mostrar o text que eu quizer
    // button = incluirButton = serve para disparar ação configurada por mim (inclui a string digitada pelo usuario no textNumbList)
    // button = concluirButton = serve para disparar ação configurada por mim (ultima coisa que ele faça é mandar o usuario para proxima Activty)

    // Logica do fluxo:
    // 1. usuario digita o numero inteiro que ele quer
    // 2. usuario aperta o botao incluir
    // 3. app converte numero digitado no formato string para inteiro
    // 4. app verifica se é par ou impar
    // 5. app armazena o numero na lista de numeros pares ou na lista de numeros impares
    // 6. app adciona o numero digitado na textview
    // 7. usuario aperta o botao concluir
    // 8. app cria uma intent para a proxima Activity
    // 9. app add lista de "par" no intent .obs: putextra = adciona variavel a intent
    // 10. app add lista de "impar" no intent
    // 11. app inicia a intent  obs: startActivity(intent) = iniciar


    private lateinit var binding: ActivityExerciseEightPartOneBinding

    // declarando variavel numblistPar do tipo MutableList<Int>
    private val numbListPar: ArrayList<Int> = ArrayList()

    // declarando variavel numbListImpar do tipo MutableList<Int>
    private val numbListaImp: ArrayList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseEightPartOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        binding.includedButton.setOnClickListener { incluirList() }

        binding.concluirButton.setOnClickListener { concluir() }

    }

    // declarando função incluirList obs: (do inicio do escopo até o fim é declarado uma função)
    fun incluirList() {


        // declarando a variavel editNumb e atribuindo o valor de binding.editNumbList
        val editNumb = binding.editNumbList

        // declarando a variavel listNumb e atribuindo o valor de binding.textNumbList
        val listNumb = binding.textNumbList

        // declarando a variavel valor e atribuindo o valor de editNumb.text
        val valor = editNumb.text

        // declarando a variavel valorString e atribuindo valor de valor.toString OBS:convertendo valor para string
        val valorString = valor.toString()

        //declarando a variavel valorInt e atribuindo valor  de valorString.toInt obs convertando valor para Int
        val valorInt = valorString.toInt()

        // comparando se o modulo(resto) da divisao de valorInt por dois é igual a zero
        if (valorInt % 2 == 0) {

            // adcionando valorInt em numbListPar
            numbListPar.add(valorInt)
        } else {

            // adcionando valorInt em numbListImp
            numbListaImp.add(valorInt)
        }

        // declarando a variavel resultFnal e atribuindo o valor de listNumb.text.toString()
        var resultFinal = listNumb.text.toString()


        // comparando se o valorInt é maior que zero
        if (valorInt > 0) {

            // concatenando(juntando) os valores de resultFinal com "\n$valor"
            resultFinal += "\n$valor"
        }

        // atribuindo valor de resultFinal em listNumb.text
        listNumb.text = resultFinal
    }

    fun concluir() {

        // declarando variavel intent e atribuindo o valor de Intent(this, ExerciseEightPartTwo::class.java)
        val intent = Intent(this, ExerciseEightPartTwo::class.java)

        intent.putIntegerArrayListExtra("par", numbListPar)
        intent.putIntegerArrayListExtra("impar",numbListaImp)

        startActivity(intent)

    }
}

