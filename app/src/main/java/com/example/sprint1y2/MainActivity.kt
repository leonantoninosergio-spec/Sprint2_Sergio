package com.example.sprint1y2

import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_funcional)

        val rbSpiderman = findViewById<RadioButton>(R.id.radioButton)
        val rbPeter = findViewById<RadioButton>(R.id.radioButton2)
        val rbHombreArana = findViewById<RadioButton>(R.id.radioButton3)

        rbSpiderman.setOnClickListener {
            Toast.makeText(this, "¡Correcto! Es Spiderman", Toast.LENGTH_SHORT).show()
        }

        rbPeter.setOnClickListener {
            Toast.makeText(this, "¡También es correcto (su identidad secreta)!", Toast.LENGTH_SHORT).show()
        }

        rbHombreArana.setOnClickListener {
            Toast.makeText(this, "¡Exacto, traducción literal!", Toast.LENGTH_SHORT).show()
        }
    }
}