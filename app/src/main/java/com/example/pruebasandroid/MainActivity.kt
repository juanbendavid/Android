package com.example.pruebasandroid

import android.os.Bundle

import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.pruebasandroid.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = binding.txtName.text
        val nick = binding.txtNick.text

        //usando lanbda
        binding.btn.setOnClickListener{
            Toast.makeText(this, "Hola $name $nick", Toast.LENGTH_LONG).show()
        }

    }
}


