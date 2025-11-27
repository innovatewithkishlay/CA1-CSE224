package com.example.gradecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.ca.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s1 = findViewById<EditText>(R.id.sub1)
        val s2 = findViewById<EditText>(R.id.sub2)
        val s3 = findViewById<EditText>(R.id.sub3)
        val result = findViewById<TextView>(R.id.result)
        val calcuBtn = findViewById<Button>(R.id.calculateBtn)

        calcuBtn.setOnClickListener {
            val a = s1.text.toString().toInt()
            val b = s2.text.toString().toInt()
            val c = s3.text.toString().toInt()

            val cgpa = (a + b + c) / 3.0
            result.text = "CGPA: $cgpa"
        }
    }
}
