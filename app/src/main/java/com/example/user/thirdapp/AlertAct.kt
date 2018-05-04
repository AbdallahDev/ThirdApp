package com.example.user.thirdapp

import android.app.AlertDialog
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_alert.*

class AlertAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)
    }

    fun change(v: View) {
        var b = AlertDialog.Builder(this).create()

        b.setTitle("Color")
        b.setMessage("Do you want to change the color ?")

        b.setButton(AlertDialog.BUTTON_POSITIVE, "Yes", { dialogInterface, i ->
            tv_hello.setTextColor(Color.RED)
        })
        b.setButton(AlertDialog.BUTTON_NEGATIVE, "No", { dialogInterface, i ->
            dialogInterface.dismiss()
        })

        b.show()
    }
}
