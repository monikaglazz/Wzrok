package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultAfter : AppCompatActivity() {

    private var visus1: TextView? = null
    private var textView12: TextView? = null
    private var textView14: TextView? = null
    private var button2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_after)
//
//        visus1 = findViewById(R.id.visus1)
//        val st = intent.extras?.get("visus1")
//        visus1?.text = getString(st as Int)

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