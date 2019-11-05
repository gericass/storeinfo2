package com.example.storeinfo2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

//配列内の画像の位置
class MyAdapter(
    private val place: IntArray,
    private val mContext: Context,
    private val onImageClick: (Int) -> Unit
) : RecyclerView.Adapter<MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.main_page, parent, false)
        return MyHolder(v, mContext)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.apply {
            index(place[position])
            itemView.setOnClickListener {
                onImageClick(place[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return place.size
    }
}