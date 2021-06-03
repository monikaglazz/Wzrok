package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class ResultShow : AppCompatActivity() {

//    private var visus1: TextView? = null
//    private var visus2: TextView? = null
//    private var visus3: TextView? = null
    private var button2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_show)

//        visus1 = findViewById(R.id.visus1)
//        visus1?.setText(GlobalVariable.vis1);
//        visus2 = findViewById(R.id.visus2)
//        visus2?.setText(GlobalVariable.vis2);
//        visus3 = findViewById(R.id.visus3)
//        visus3?.setText(GlobalVariable.vis3);

        button2 = findViewById(R.id.button2)
        button2?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openWyniki()
            }
        })
    }

    fun openWyniki(){
        val intent = Intent(this, Wyniki::class.java)
        startActivity(intent)
        Animatoo.animateSlideRight(this)
    }
}