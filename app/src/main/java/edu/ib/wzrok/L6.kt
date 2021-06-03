package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class L6 : AppCompatActivity() {

    private var btnStop : Button? = null
    private var btnNext : Button? = null
    private var TextView8: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r6)

        btnNext = findViewById(R.id.btnNext1)
        btnNext?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openBoth()
            }
        })

        btnStop = findViewById(R.id.btnStop)
        btnStop?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openBoth_stop()
            }
        })
    }

    fun openBoth_stop(){
        val v = 0.8
        GlobalVariable.vis2=v.toString()
        val intent = Intent(this, Both::class.java)
        startActivity(intent)
        Animatoo.animateSlideLeft(this)
    }

    fun openBoth(){
        val v = 1.0
        GlobalVariable.vis2=v.toString()
        val intent = Intent(this, Both::class.java)
        startActivity(intent)
        Animatoo.animateSlideLeft(this)
    }


}