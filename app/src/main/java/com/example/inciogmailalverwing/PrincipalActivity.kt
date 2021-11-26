package com.example.inciogmailalverwing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.common.SignInButton

class  PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val bundle = intent.extras
        if (bundle != null){

            val nombre = bundle.getString("name")
            val correo = bundle.getString("email")

            val tv_nombre: TextView = findViewById(R.id.tv_nombre)
            val tv_email: TextView = findViewById(R.id.tv_email)

            tv_nombre.setText(nombre)
            tv_email.setText(correo)
        }

        val boton: Button = findViewById(R.id.btn_cerrar)

        boton.setOnClickListener{
            finish()
        }

    }
}