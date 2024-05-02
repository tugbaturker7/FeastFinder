package com.example.feastfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var rv : RecyclerView
    private lateinit var foodList : ArrayList<Foods>
    private lateinit var adapter: FoodAdapter
    private lateinit var suggestion : ImageView
    private lateinit var contact: Button
    private lateinit var about: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contact = findViewById(R.id.button)
        about =findViewById(R.id.button2)
        suggestion = findViewById(R.id.suggestionImageView)
        rv = findViewById(R.id.rv)

        rv.setHasFixedSize(true)

        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val i1 = Foods("Lahmacun")
        val i2 = Foods("Kebap")
        val i3 = Foods("Mantı")
        val i4 = Foods("Yaprak Sarma")
        val i5 = Foods("Baklava")




        foodList = ArrayList<Foods>()
        foodList.add(i1)
        foodList.add(i2)
        foodList.add(i3)
        foodList.add(i4)
        foodList.add(i5)



        adapter = FoodAdapter(this,foodList)

        rv.adapter = adapter

        suggestion.setOnClickListener() {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("foodname", "Kebap")
            startActivity(intent)
        }

        contact.setOnClickListener { view ->
            onSeriesButtonClick(view)
        }
        about.setOnClickListener { view ->
            onSeriesButtonClick2(view)
        }
    }

    private fun onSeriesButtonClick(view: View) {



        val intent = Intent(this, InfoActivity::class.java)
        intent.putExtra("infoname", "contact")
        startActivity(intent)
    }
    private fun onSeriesButtonClick2(view: View) {


        val intent = Intent(this, InfoActivity::class.java)
        intent.putExtra("infoname", "about")
        startActivity(intent)
    }
}