package edu.ib.wzrok

import android.content.Intent
import android.os.AsyncTask
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.util.*


class ResultAfter : AppCompatActivity() {

//    private var visus1: TextView? = null
//    private var visus2: TextView? = null
//    private var visus3: TextView? = null
    private var buttonsave: Button? = null

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_result_after)

        val visus1: TextView = findViewById(R.id.visus1)
        visus1?.setText(GlobalVariable.vis1);
        val visus2: TextView = findViewById(R.id.visus2)
        visus2?.setText(GlobalVariable.vis2);
        val visus3: TextView = findViewById(R.id.visus3)
        visus3?.setText(GlobalVariable.vis3);

        buttonsave = findViewById(R.id.buttonsave)
        buttonsave?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                runBlocking {
                    insertResult(
                        visus1.text.toString().toFloat(),
                        visus2.text.toString().toFloat(),
                        visus3.text.toString().toFloat(),
                        GlobalVariable.name
                    )

                }
                openWyniki()
            }
        })




    }

    fun openWyniki(){
        val intent = Intent(this, Wyniki::class.java)
        startActivity(intent)
    }
    suspend fun insertResult(visusL: Float,visusR: Float,visusB: Float,name: String){
        return withContext(Dispatchers.IO){
            var db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "results-db").fallbackToDestructiveMigration()
                .build()
            var resultDB = db.resultDao()
            resultDB.insert(Result(0,visusL,visusR,visusB,GlobalVariable.name, Date()))
        }

    }
}