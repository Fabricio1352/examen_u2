package com.example.examenu2

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class CategoriaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categoria)

        val gridView: GridView = findViewById(R.id.gridView)
        val categoria = intent.getStringExtra("CATEGORIA")

        val productos = obtenerProductosPorCategoria(categoria)
        val adapter = ProductoAdapter(this, productos)
        gridView.adapter = adapter

        gridView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetalleProductoActivity::class.java)
            intent.putExtra("PRODUCTO", productos[position])
            startActivity(intent)
        }
    }

    private fun obtenerProductosPorCategoria(categoria: String?): List<DetalleProductoActivity> {
        return when (categoria) {
            "Detalles" -> listOf(DetalleProductoActivity(R.drawable.peluchemario, "$10"), DetalleProductoActivity(R.drawable.peluchemario, "$15"))
            "Globos" -> listOf(DetalleProductoActivity(R.drawable.peluchesony, "$5"), DetalleProductoActivity(R.drawable.peluchesony, "$7"))
            "Peluches" -> listOf(DetalleProductoActivity(R.drawable.globos, "$20"), DetalleProductoActivity(R.drawable.globos, "$25"))
            "Regalos" -> listOf(DetalleProductoActivity(R.drawable.cumplecheve, "$30"), DetalleProductoActivity(R.drawable.cumplecheve, "$35"))
            "Tazas" -> listOf(DetalleProductoActivity(R.drawable.cumplesnack, "$12"), DetalleProductoActivity(R.drawable.cumplesnack, "$14"))
            else -> emptyList()
        }
    }
}




