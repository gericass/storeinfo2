package com.example.storeinfo2


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout.VERTICAL
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val atmosRecyclerView = findViewById<View>(R.id.atmosRecyclerView) as RecyclerView
        val photo = intArrayOf(R.drawable.motibe, R.drawable.drink, R.drawable.motibe, R.drawable.drink,
            R.drawable.motibe, R.drawable.drink, R.drawable.motibe)

        val lManager = GridLayoutManager(this, 3, VERTICAL, false)
        atmosRecyclerView.setLayoutManager(lManager)
        atmosRecyclerView.adapter = MyAdapter(photo, this)
    }


    fun onImageClick(view: View) {
        val intent = Intent(this, Info3Activity::class.java)
        //intent.putExtra("photo", )
        startActivity(intent)
    }

}
