package com.example.newsfeed.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newsfeed.R
import com.example.newsfeed.model.News

class ListAdapter(private val context: Context, private val dataSet : List<News>) : RecyclerView.Adapter<ListAdapter.NewsViewHolder>(){

    class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val newsImage : ImageView = view.findViewById(R.id.news_image)
        val newsLetter : TextView = view.findViewById(R.id.news_highlight)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return NewsViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = dataSet[position]
        holder.newsImage.setImageResource(news.imageResourceId)
        holder.newsLetter.text = context.resources.getString(news.stringResourceId)
    }

    override fun getItemCount() = dataSet.size
}