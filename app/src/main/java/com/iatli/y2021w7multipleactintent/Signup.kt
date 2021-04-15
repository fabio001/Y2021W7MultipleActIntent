package com.iatli.y2021w7multipleactintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

    fun btn_register_click(view: View) {
        //get user name and password
        //suppose that we have taken
        val username = findViewById<EditText>(R.id.editTextTextPersonName).text.toString()

        val intent = Intent()
        intent.putExtra("newusername", username)
        setResult(RESULT_OK, intent)
        finish() // destroys this activity
    }
}