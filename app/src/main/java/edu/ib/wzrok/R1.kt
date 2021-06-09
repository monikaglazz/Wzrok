package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class R1 : AppCompatActivity() {
    private var btnStop : Button? = null
    private var btnNext : Button? = null
    private var TextView8: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r1)


        btnNext = findViewById(R.id.btnNext1)
        btnNext?.setOnClickListener(object  : View.OnClickListener{
            override fun onClick(v: View?) {
                openR2()
            }
        })

        btnStop = findViewById(R.id.btnStop)
        btnStop?.setOnClickListener(object  : View.OnClickListener{
            override fun onClick(v: View?) {
                openLeft()
            }
        })
    }

    fun openR2(){
        val intent = Intent(this, R2::class.java)
        startActivity(intent)
        Animatoo.animateFade(this)
    }

    fun openLeft(){
        val v = 0.1
        GlobalVariable.vis1=v.toString()
        val intent = Intent(this, Left::class.java)
        startActivity(intent)
    }
    override fun onBackPressed(){
        Log.d("BACK","nadpisana funkcja")
    }


}