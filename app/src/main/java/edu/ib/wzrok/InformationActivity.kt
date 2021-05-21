package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class InformationActivity : AppCompatActivity() {

    private var text_view1 : TextView? = null
    private var text_view2 : TextView? = null
    private var text_view3 : TextView? = null
    private var text_view4 : TextView? = null
    private var btnOk : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        btnOk = findViewById(R.id.btnOk)
        btnOk?.setOnClickListener(object  : View.OnClickListener{
            override fun onClick(v: View?) {
                openRightActivity()
            }
        })
        
    }

    fun openRightActivity(){
        val intent= Intent(this, Right::class.java)
        startActivity(intent)
    }
}