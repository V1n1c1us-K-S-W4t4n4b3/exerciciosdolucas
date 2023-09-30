package com.example.exerciciosdolucas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exerciciosdolucas.databinding.ActivityExerciseTwelveBinding

class ExerciseTwelve : AppCompatActivity() {
    private lateinit var binding: ActivityExerciseTwelveBinding
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

    fun validarNames(n1: String, n2: String, n3: String, n4: String, n5: String): Boolean {

        return !n1.isNullOrEmpty() && !n2.isNullOrEmpty() && !n3.isNullOrEmpty() && !n4.isNullOrEmpty() && n5.isNullOrEmpty()

    }

    fun validarIdade(v1: Int, v2: Int, v3: Int, v4: Int, v5: Int) {

        return v1 != null && v2 != null && v3 != null && v4 != null && v5 != null


    }

}