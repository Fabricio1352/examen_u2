package com.example.examenu2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView


class RegalosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        val gridView: GridView = findViewById(R.id.gridView)
        val imageList = listOf(
            R.drawable.pelucheminecraft,
            R.drawable.peluchemario,
            R.drawable.peluchepeppa,
            R.drawable.peluchesony,
            R.drawable.peluchestich,
            R.drawable.peluchevarios
        )

        val adapter = GridAdapter(this, imageList)
        gridView.adapter = adapter
    }
}



