package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Both : AppCompatActivity() {
    private var btnStart : Button? = null
    private var TextView: TextView? = null
    private var TextView3: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_both)


        btnStart = findViewById(R.id.btnStart)
        btnStart?.setOnClickListener(object  : View.OnClickListener{
            override fun onClick(v: View?) {
                openB1()
            }
        })
    }

    fun openB1(){
        val intent = Intent(this, B1::class.java)
        startActivity(intent)
    }
}