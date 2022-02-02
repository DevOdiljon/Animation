package com.example.animation4_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.animation.AnimationUtils

class Vazifa2Activity : AppCompatActivity() {
    lateinit var animation:Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vazifa2)

        var iv_img_2 = findViewById<ImageView>(R.id.iv_img_2)
        var btn_vaz2_sequential = findViewById<Button>(R.id.btn_vaz2_sequential)
        btn_vaz2_sequential.setOnClickListener(View.OnClickListener {
            var animation = android.view.animation.AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential)
            iv_img_2.startAnimation(animation);
        })
    }
}