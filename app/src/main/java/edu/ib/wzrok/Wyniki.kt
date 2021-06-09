package edu.ib.wzrok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import kotlinx.coroutines.*

class Wyniki : AppCompatActivity() {
    private var imageButton2 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wyniki)

        val results: List<Result>
        runBlocking {
            results = getResults()
        }
        val recyclerView: RecyclerView = findViewById(R.id.WynikiRecycler)

        val manager: LinearLayoutManager = LinearLayoutManager(this)
        manager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = manager
        recyclerView.adapter = WynikiAdapter(results)
        recyclerView.visibility = View.VISIBLE
        recyclerView.setBackgroundColor(24)
        //resultTableRow.add

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
     suspend fun getResults() : List<Result>{

         return CoroutineScope(Dispatchers.IO).async{
            var db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "results-db")
                .fallbackToDestructiveMigration()
                .build()
            var resultDB = db.resultDao()
            resultDB.getAll()
        }.await()

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