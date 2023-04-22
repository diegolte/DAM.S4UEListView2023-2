package com.example.s4uelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var arrSO =
        arrayOf(
            "Android", "iOS", "Windows Phone",
            "Blackberry OS", "Firefox OS",
            "Amazon World", "Nokia"
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lsvSO: ListView = findViewById(R.id.lsvSO)
        val adaptador: Any? = ArrayAdapter<Any>(this, android.R.layout.simple_list_item_1, arrSO)
        lsvSO.adapter = adaptador as ListAdapter?

        lsvSO.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "Posición: $position",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}