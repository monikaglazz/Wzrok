package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickHome1(view: View) {
        val intent=Intent(this, start::class.java)
        startActivity(intent)
    }
    fun clickHome2(view: View) {}


    // Iza ma kota

    // Lubie cukierki XD
}