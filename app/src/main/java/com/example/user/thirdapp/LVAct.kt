package com.example.user.thirdapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lv.*

class LVAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lv)

        var books = ArrayList<String>()
        books.add("Android")
        books.add("PHP")
        books.add("Java")
        books.add("C#")

        var adp = ArrayAdapter(this, android.R.layout.simple_list_item_1, books)

        lv.adapter = adp
        lv.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, books[i],
                    Toast.LENGTH_LONG).show()
        }
        lv.setOnItemLongClickListener { adapterView, view, i, l ->
            adp.remove(books[i])
            true
        }
    }
}
