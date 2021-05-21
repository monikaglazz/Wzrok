package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class B3 : AppCompatActivity() {
    private var btnStop: Button? = null
    private var btnNext: Button? = null
    private var TextView8: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r3)


        btnNext = findViewById(R.id.btnNext1)
        btnNext?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openB4()
            }
        })

        btnStop = findViewById(R.id.btnStop)
        btnStop?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openResult()
            }
        })
    }

    fun openResult() {
        val intent = Intent(this, ResultAfter::class.java)
        startActivity(intent)
    }

    fun openB4() {
        val intent = Intent(this, B4::class.java)
        startActivity(intent)
    }
}