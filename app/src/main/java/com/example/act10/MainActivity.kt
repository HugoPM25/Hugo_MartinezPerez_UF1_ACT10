package com.example.act10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombre = findViewById<EditText>(R.id.editTextText5)
        val apellido = findViewById<EditText>(R.id.editTextText6)
        val edad = findViewById<EditText>(R.id.editTextText7)
        val usuari = findViewById<EditText>(R.id.editTextText8)
        val contrasenya = findViewById<EditText>(R.id.editTextText9)

        val botonEnviar = findViewById<Button>(R.id.button2)
        val botonCambiarPantalla = findViewById<Button>(R.id.button3)

        botonEnviar.setOnClickListener {
            val respuestaNombre = nombre.text.toString();
            val respuestaApellido = apellido.text.toString();
            val respuestaEdad = edad.text.toString();
            val respuestaUsuari = usuari.text.toString();
            val respuestaContrasenya = contrasenya.text.toString();

            val mensaje = "Nombre: $respuestaNombre, Apellido: $respuestaApellido, Edad $respuestaEdad, Usuario: $respuestaUsuari, Contraseña: $respuestaContrasenya";
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

        }

        botonCambiarPantalla.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}