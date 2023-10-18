package com.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnHombre =  findViewById<Button>(R.id.btnHombre)
        val btnMujer = findViewById<Button>(R.id.btnMujer)

        btnHombre.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("genero","hombre")
            startActivity(intent)
        }

       btnMujer.setOnClickListener{
            val intent2 = Intent(this, MainActivity3::class.java)
            intent2.putExtra("genero","mujer")
            startActivity(intent2)

       }

    }
}