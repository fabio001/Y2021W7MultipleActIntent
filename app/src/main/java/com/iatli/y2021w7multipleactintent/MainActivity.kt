package com.iatli.y2021w7multipleactintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the intent from here if anpther activity calls it
        if(intent != null){
            val username = intent.getStringExtra("username")
            val txtusername = findViewById<TextView>(R.id.txtmainusername)
            txtusername.text = username
        }
    }

}