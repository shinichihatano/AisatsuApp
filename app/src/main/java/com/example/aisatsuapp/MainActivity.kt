package com.example.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        showTimePickerDialog()

    }

    private fun showTimePickerDialog(){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{view, hour ,minute ->
                if( hour >= 18 && minute >= 0) {
                    //textview1.text = "$hour:$minute"
                    textview1.text = "こんばんは"
                }else if(hour >= 10 && minute >= 0){
                    textview1.text = "こんにちは"
                }else if(hour >= 2 && minute >= 0){
                    textview1.text = "おはよう"
                }
            },
            13, 0, true)
        timePickerDialog.show()
    }
}