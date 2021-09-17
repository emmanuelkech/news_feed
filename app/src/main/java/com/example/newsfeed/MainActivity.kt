package com.example.newsfeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.newsfeed.data.NewsSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myDataSet = NewsSource().loadNews()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = com.example.newsfeed.adapter.ListAdapter(this, myDataSet)
        recyclerView.setHasFixedSize(true)
    }
}