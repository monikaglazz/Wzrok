package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class B2 : AppCompatActivity() {
    private var btnStop: Button? = null
    private var btnNext: Button? = null
    private var TextView8: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r2)


        btnNext = findViewById(R.id.btnNext1)
        btnNext?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openB3()
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
        val v = 0.2
        GlobalVariable.vis3=v.toString()
        val intent = Intent(this, ResultAfter::class.java)
        startActivity(intent)
    }

    fun openB3() {
        val intent = Intent(this, B3::class.java)
        startActivity(intent)
        Animatoo.animateFade(this)
    }
}