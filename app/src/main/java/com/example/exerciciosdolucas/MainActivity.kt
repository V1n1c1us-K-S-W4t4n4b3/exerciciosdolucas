package com.example.exerciciosdolucas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciciosdolucas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonExc1.setOnClickListener {
            val irParaPag1 = Intent(this, Exercicio1::class.java)
            startActivity(irParaPag1)
        }
        binding.buttonExc2.setOnClickListener {
            val irParaPag2 = Intent(this, Exercicio2::class.java)
            startActivity(irParaPag2)
        }
        binding.buttonExc3.setOnClickListener {
            val irParaPag3 = Intent(this, Exercicio3::class.java)
            startActivity(irParaPag3)
        }
        binding.buttonExc4.setOnClickListener {
            val irParaPag4 = Intent(this, Exercicio4::class.java)
            startActivity(irParaPag4)
        }
        binding.buttonExc5.setOnClickListener {
            val irParaPag5 = Intent(this, Exercicio5::class.java)
            startActivity(irParaPag5)
        }
        binding.buttonExc6.setOnClickListener {
            val irParaPag6 = Intent(this, Exercicio6::class.java)
            startActivity(irParaPag6)
        }
        binding.buttonExc7.setOnClickListener {
            val irParaPag7 = Intent(this, Exercicio7::class.java)
            startActivity(irParaPag7)
        }
        binding.buttonExc8.setOnClickListener {
            val irParaPag8 = Intent(this, Exercicio8::class.java)
            startActivity(irParaPag8)
        }
        binding.buttonExc9.setOnClickListener {
            val irParaPag9 = Intent(this, Exercicio9::class.java)
            startActivity(irParaPag9)
        }
        binding.buttonExc10.setOnClickListener {
            val irParaPag10 = Intent(this, Exercicio10::class.java)
            startActivity(irParaPag10)
        }
        binding.buttonExc11.setOnClickListener {
            val irParaPag11 = Intent(this, Exercicio11::class.java)
            startActivity(irParaPag11)
        }
        binding.buttonExc12.setOnClickListener {
            val irParaPag12 = Intent(this, Exercicio12::class.java)
            startActivity(irParaPag12)
        }
    }
}

