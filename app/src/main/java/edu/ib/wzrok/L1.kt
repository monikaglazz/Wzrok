package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class L1 : AppCompatActivity() {
    private var btnStop : Button? = null
    private var btnNext : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r1)


        btnNext = findViewById(R.id.btnNext1)
        btnNext?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openL2()
            }
        })

        btnStop = findViewById(R.id.btnStop)
        btnStop?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openBoth()

            }
        })
    }

    fun openBoth(){
        val v = 0.1
        GlobalVariable.vis2=v.toString()
        val intent = Intent(this, Both::class.java)
//        val intent2 = Intent(this, ResultAfter::class.java)
//        val visus = 0.5
//        intent2.putExtra("visus11",visus)
        startActivity(intent)

    }

    fun openL2(){
        val intent = Intent(this, L2::class.java)
        startActivity(intent)
        Animatoo.animateFade(this)
    }



}