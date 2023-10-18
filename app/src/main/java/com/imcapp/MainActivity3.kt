package com.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val genero:String = intent.extras?.getString("genero").orEmpty()
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)


        btnCalcular.setOnClickListener{

            val txtEdad = findViewById<EditText>(R.id.etEdad)
            val txtAltura = findViewById<EditText>(R.id.etAltura)
            val txtPeso = findViewById<EditText>(R.id.etPeso)

            val altura = txtAltura.text.toString()
            val peso = txtPeso.text.toString()
            var respuesta = ""

            val IMC = (peso.toDouble()/(altura.toDouble() * altura.toDouble()))

            Log.i("peso",IMC.toString())

            //if (genero == "hombre"){


                when (IMC){
                    in 0.0..18.4 ->{
                        respuesta = "BAJO DE PESO"
                    }
                    in 18.5..24.9 ->{
                        respuesta = "PESO NORMAL"
                    }
                    in 25.0..29.9->{
                        respuesta = "SOBREPESO"
                    }
                    in 30.0..34.9 ->{
                        respuesta = "OBESIDAD GRADO 1"
                    }
                    in 35.0..39.9 ->{
                        respuesta = "OBESIDAD GRADO 2"
                    }
                    else ->{
                        respuesta = "OBESIDAD GRADO 3"
                    }

                }

            /*}else{
                when (IMC){
                    in 0.0..18.4 ->{
                        respuesta = "BAJO DE PESO"
                    }
                    in 18.5..24.9 ->{
                        respuesta = "PESO NORMAL"
                    }
                    in 25.0..29.9->{
                        respuesta = "SOBREPESO"
                    }
                    in 30.0..34.9 ->{
                        respuesta = "OBESIDAD GRADO 1"
                    }
                    in 35.0..39.9 ->{
                        respuesta = "OBESIDAD GRADO 2"
                    }
                    else ->{
                        respuesta = "OBESIDAD GRADO 3"
                    }

                }


            }
            */

            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra("resultado",respuesta)
            intent.putExtra("resultadopeso",IMC)

            startActivity(intent)
        }





    }
}