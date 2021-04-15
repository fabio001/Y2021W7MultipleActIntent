package com.iatli.y2021w7multipleactintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class LoginScreen : AppCompatActivity() {
    val SIGN_REQUEST_CODE = 1234 // 1-65000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    fun btn_login_click(view: View) {
        val username = findViewById<EditText>(R.id.txtusername).text.toString()
        val password = findViewById<EditText>(R.id.txtpassword).text.toString()

        if(username.equals("admin") && password.equals("password")) {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
        }
        else{
            Toast.makeText(this, "The username or password is not valid!", Toast.LENGTH_SHORT).show()
        }


    }

    fun btn_signup(view: View) {
        val intent = Intent(this, Signup::class.java)
        startActivityForResult(intent, SIGN_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == SIGN_REQUEST_CODE && resultCode == RESULT_OK){
            val uname = data!!.getStringExtra("newusername")
            Toast.makeText(this, "New user $uname is registered", Toast.LENGTH_SHORT).show()
        }
    }

    fun btn_help(view: View) {
        val uri = Uri.parse("http://www.aybu.edu.tr")
        //implicit intent
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
}