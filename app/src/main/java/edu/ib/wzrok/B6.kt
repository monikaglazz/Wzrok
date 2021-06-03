package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class B6 : AppCompatActivity() {
    private var btnStop: Button? = null
    private var btnNext: Button? = null
    private var TextView8: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r6)


        btnNext = findViewById(R.id.btnNext1)
        btnNext?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openResult()
            }
        })

        btnStop = findViewById(R.id.btnStop)
        btnStop?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openResult_stop()
            }
        })
    }

    fun openResult_stop() {
        val v = 0.8
        GlobalVariable.vis3=v.toString()
        val intent = Intent(this, ResultAfter::class.java)
        startActivity(intent)
        Animatoo.animateSlideLeft(this)
    }

    fun openResult() {
        val v = 1.0
        GlobalVariable.vis3=v.toString()
        val intent = Intent(this, ResultAfter::class.java)
        startActivity(intent)
        Animatoo.animateSlideLeft(this)
    }
}