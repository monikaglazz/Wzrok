package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ResultShow : AppCompatActivity() {

    private var button2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_show)

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
    }
}