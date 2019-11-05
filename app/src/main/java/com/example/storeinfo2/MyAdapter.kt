package com.example.storeinfo2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

//配列内の画像の位置
class MyAdapter(private val place : IntArray, private val mContext : Context) : RecyclerView.Adapter<MyHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.main_page, parent, false)
        return MyHolder(v, mContext)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder?.index(place[position])
    }

    override fun getItemCount(): Int {
        return place.size
    }
}