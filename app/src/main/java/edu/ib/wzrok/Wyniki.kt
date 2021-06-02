package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Wyniki : AppCompatActivity() {
    private var btnBack : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wyniki)

        btnBack = findViewById(R.id.buttonBack)
        btnBack?.setOnClickListener(object  : View.OnClickListener{
            override fun onClick(v: View?) {
                openHome()
            }
        })
    }


    fun openHome(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        Animatoo.animateZoom(this)
    }
}