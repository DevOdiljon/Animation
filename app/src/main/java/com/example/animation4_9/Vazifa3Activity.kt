package com.example.animation4_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class Vazifa3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vazifa3)

        var iv_togather = findViewById<ImageView>(R.id.iv_bogather)

        var btn_togather = findViewById<Button>(R.id.btn_togather)
        btn_togather.setOnClickListener(View.OnClickListener {
            var animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.togather_animation)
            iv_togather.startAnimation(animation)
        })
    }
}