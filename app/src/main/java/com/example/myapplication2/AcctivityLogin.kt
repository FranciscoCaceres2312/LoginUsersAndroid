package com.example.myapplication2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AcctivityLogin : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val app = applicationContext as UserApp

        val etLogin = findViewById<EditText>(R.id.etLogin)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {

            val username = etLogin.text.toString()
            val password = etPassword.text.toString()

            app.room.daoUser().insert(EntityUser( 0,username,password))

            val intent = Intent(this, ResultActivity::class.java)

            intent.putExtra("USERNAME", username)

            startActivity(intent)
        }   }
}