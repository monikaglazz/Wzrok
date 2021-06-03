package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Wyniki : AppCompatActivity() {
    private var imageButton2 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wyniki)
//
//        imageButton2 = findViewById(R.id.imageButton2)
//        imageButton2?.setOnClickListener(object  : View.OnClickListener {
//            override fun onClick(v: View?) {
//                openResult()
//            }
//        })

//        btnBack = findViewById(R.id.buttonBack)
//        btnBack?.setOnClickListener(object  : View.OnClickListener{
//            override fun onClick(v: View?) {
//                openHome()
//            }
//        })
    }

    fun openResult(){
        val intent = Intent(this, ResultShow::class.java)
        startActivity(intent)
        Animatoo.animateSlideLeft(this)
    }

    fun openHome(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        Animatoo.animateZoom(this)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        openHome()
    }
}