package com.example.examenu2
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ProductoAdapter(private val context: Context, private val productos: List<DetalleProductoActivity>) : BaseAdapter() {
    override fun getCount(): Int = productos.size
    override fun getItem(position: Int): Any = productos[position]
    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_producto, parent, false)
        val imagen = view.findViewById<ImageView>(R.id.imageProducto)
        val precio = view.findViewById<TextView>(R.id.textPrecio)

        val producto = productos[position]
        imagen.setImageResource(producto.image)
        precio.text = producto.precio

        return view
    }
}
