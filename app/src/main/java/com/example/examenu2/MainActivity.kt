package com.example.examenu2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_principal)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        findViewById<Button>(R.id.btnDetalles).setOnClickListener { abrirCategoria("Detalles") }
        findViewById<Button>(R.id.btnGlobos).setOnClickListener { abrirCategoria("Globos") }
        findViewById<Button>(R.id.btnPeluches).setOnClickListener { abrirCategoria("Peluches") }
        findViewById<Button>(R.id.btnRegalos).setOnClickListener { abrirCategoria("Regalos") }
        findViewById<Button>(R.id.btnTazas).setOnClickListener { abrirCategoria("Tazas") }
    }

    private fun abrirCategoria(categoria: String) {
        val intent = Intent(this, CategoriaActivity::class.java)
        intent.putExtra("CATEGORIA", categoria)
        startActivity(intent)
    }
}