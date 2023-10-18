package com.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val respuesta = intent?.getStringExtra("resultado").orEmpty()
        val respuestapeso = intent?.getDoubleExtra("resultadopeso",0.0)

        val tvRespuesta = findViewById<TextView>(R.id.tvRespuesta)
        val tvRespuestapeso = findViewById<TextView>(R.id.tvRespuestapeso)

        tvRespuesta.text = "$respuesta"
        tvRespuestapeso.text = "$respuestapeso"

    }
}