package com.example.storeinfo2


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class Info3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info3)
        
        val photo = getDrawable(intent.getIntExtra(PHOTO, 0))
        val imageView = findViewById<ImageView>(R.id.imageView)
        Glide.with(this).load(photo).into(imageView)
    }

    companion object {
        private const val PHOTO: String = "photo"

        fun createIntent(activity: Activity, @DrawableRes photo: Int) =
            Intent(activity, Info3Activity::class.java).apply {
                putExtra(PHOTO, photo)
            }
    }
}