package com.irzstudio.GroceryStore.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.irzstudio.GroceryStore.R

class GetStartedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started) // Используйте правильный ID вашего layout

        val ivGifBackground: ImageView = findViewById(R.id.iv_gif_background)
        Glide.with(this)
            .asGif()
            .load(R.drawable.
            iv_gif_background)
            .into(ivGifBackground)

        // Обработка нажатия на изображение для перехода к MainMenuActivity
        ivGifBackground.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
