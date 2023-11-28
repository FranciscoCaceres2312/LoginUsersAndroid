package com.example.myapplication2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val app = applicationContext as UserApp

        val tableLayout : TableLayout = findViewById(R.id.tableLayout)
        val result = findViewById<TextView>(R.id.tvresult)
        val name:String = intent.extras?.getString("USERNAME").orEmpty()
        result.text="HOLA $name"

        val allUsers = app.room.daoUser().getAll()

        for (nombreUsuario in allUsers) {
            val tableRow = TableRow(this)

            val textView = TextView(this)
            textView.text = nombreUsuario.toString()
            textView.setPadding(8, 8, 8, 8)

            tableRow.addView(textView)
            tableLayout.addView(tableRow)
        }
    }
}