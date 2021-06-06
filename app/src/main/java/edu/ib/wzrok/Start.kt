package edu.ib.wzrok

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.res.TypedArrayUtils.getText
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.jar.Attributes
import android.util.Log
class Start : AppCompatActivity() {

    private var button : Button? = null
    private var textDate: TextView? = null
    private var textView2: TextView? = null
    private var date : TextView? = null
//    private var userInput = null

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val userInput: TextView  = findViewById(R.id.name)
        button = findViewById(R.id.button)
        button?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                val name: String = userInput.text.toString()
                Log.d("NAME","Wartośc imienia to: "+name)
                if(name.trim().length>0) {
                    Log.d("NAME","Idziemy dalej")
                    openInformationActivity()
                }else{
                    Log.d("NAME","Wyswietlamy komunikat")
                    Toast.makeText(applicationContext, "Musisz podać imie", Toast.LENGTH_SHORT).show()
                }

            }
        })


        date = findViewById(R.id.date)
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        val formatted = current.format(formatter)
        date?.setText(formatted)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        Animatoo.animateSlideRight(this)
    }

    fun openInformationActivity(){
        val intent= Intent(this, InformationActivity::class.java)
        startActivity(intent)
        Animatoo.animateSlideLeft(this)
    }
}