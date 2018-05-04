package com.example.user.thirdapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun display(v:View)
    {
        var n="Welcome " + et_name.text.toString()
        Toast.makeText(this,n,Toast.LENGTH_LONG).show()
    }
}
