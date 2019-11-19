package com.lroap.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.lroap.coderswag.Adapters.CategoryAdapter
import com.lroap.coderswag.Model.Category
import com.lroap.coderswag.R
import com.lroap.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

//        adapter = ArrayAdapter(this,
//           // android.R.layout.simple_list_item_1, (estas son listas ya definidas por android, no las usaremos porque crearemos nuevas con adapter)
//            DataService.categories)

        categoryListView.adapter = adapter

//        categoryListView.setOnItemClickListener { adapterView, view, i, l ->
//            val category = DataService.categories[i]
//            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()


    }
}
