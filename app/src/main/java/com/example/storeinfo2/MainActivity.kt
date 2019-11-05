package com.example.storeinfo2


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout.VERTICAL
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private val onImageClick = { resId: Int ->
        val intent = Info3Activity.createIntent(this, resId)
        startActivity(intent)
    }

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val atmosRecyclerView = findViewById<View>(R.id.atmosRecyclerView) as RecyclerView
        val photo = intArrayOf(
            R.drawable.motibe, R.drawable.drink, R.drawable.motibe, R.drawable.drink,
            R.drawable.motibe, R.drawable.drink, R.drawable.motibe
        )

        val lManager = GridLayoutManager(this, 3, VERTICAL, false)
        atmosRecyclerView.apply {
            layoutManager = lManager
            adapter = MyAdapter(photo, this@MainActivity, onImageClick)
        }
    }
}
