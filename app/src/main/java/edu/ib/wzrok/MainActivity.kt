package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class MainActivity : AppCompatActivity() {

    private var btnHome2 : Button? = null
    private var btnHome1 : Button? = null
    private var textHome: TextView? = null
    private var textHome2: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome1 = findViewById(R.id.btnHome1)
        btnHome1?.setOnClickListener(object  : View.OnClickListener{
            override fun onClick(v: View?) {
                openStartActivity()
            }
        })

        btnHome2 = findViewById(R.id.btnHome2)
        btnHome2?.setOnClickListener(object  : View.OnClickListener{
            override fun onClick(v: View?) {
                openWynikiActivity()
            }
        })

    }

    override fun onBackPressed() {
        super.onBackPressed()
        Animatoo.animateCard(this) // dlaczego ta animacja nie działa?
    }

    fun openStartActivity(){
        val intent = Intent(this, Start::class.java)
        startActivity(intent)
    }

    fun openWynikiActivity(){
        val intent = Intent(this, Wyniki::class.java)
        startActivity(intent)
    }


}