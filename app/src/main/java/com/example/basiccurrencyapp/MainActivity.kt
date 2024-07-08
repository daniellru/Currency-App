package com.example.basiccurrencyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basiccurrencyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnResult.setOnClickListener{
            val dollars = 1.10
            val euro = binding.edValue.text.toString().toDouble()

            val result = euro * dollars

            binding.tvResult.text = String.format("%.2f", result)+"$"

        }
    }
}