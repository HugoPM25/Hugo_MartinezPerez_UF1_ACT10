package com.example.act10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nombre = findViewById<EditText>(R.id.editTextText)
        val apellido = findViewById<EditText>(R.id.editTextText2)
        val edad = findViewById<EditText>(R.id.editTextText4)
        val usuari = findViewById<EditText>(R.id.editTextText3)
        val contrasenya = findViewById<EditText>(R.id.editTextText10)

        val botonEnviar = findViewById<Button>(R.id.button)
        val botonCambiarPantalla = findViewById<Button>(R.id.button4)

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
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}