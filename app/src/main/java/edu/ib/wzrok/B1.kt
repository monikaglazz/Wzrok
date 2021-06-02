package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class B1 : AppCompatActivity() {
    private var btnStop: Button? = null
    private var btnNext: Button? = null
    private var TextView8: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r1)


        btnNext = findViewById(R.id.btnNext1)
        btnNext?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openB2()
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

    fun openB2() {
        val intent = Intent(this, B2::class.java)
        startActivity(intent)
        Animatoo.animateFade(this)
    }
}