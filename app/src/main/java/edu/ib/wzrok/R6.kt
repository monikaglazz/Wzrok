package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class R6 : AppCompatActivity() {
    private var btnStop : Button? = null
    private var btnNext : Button? = null
    private var TextView8: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r6)


        btnNext = findViewById(R.id.btnNext1)
        btnNext?.setOnClickListener(object  : View.OnClickListener{
            override fun onClick(v: View?) {
                openR7()
            }
        })

        btnStop = findViewById(R.id.btnStop)
        btnStop?.setOnClickListener(object  : View.OnClickListener{
            override fun onClick(v: View?) {
                openLeft()
            }
        })
    }

    fun openR7(){
        val intent = Intent(this, R7::class.java)
        startActivity(intent)
        Animatoo.animateFade(this)
    }

    fun openLeft(){
        val intent = Intent(this, Left::class.java)
        startActivity(intent)
    }
}