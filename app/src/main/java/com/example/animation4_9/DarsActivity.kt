package com.example.animation4_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class DarsActivity : AppCompatActivity() {
    lateinit var iv_img:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dars)

        initViews()
    }
    fun initViews(){
        iv_img = findViewById<ImageView>(R.id.iv_img)
        var btn_zoom = findViewById<Button>(R.id.btn_zoom)
        var btn_rotate = findViewById<Button>(R.id.btn_rotate)
        var btn_fade = findViewById<Button>(R.id.btn_fade)
        var btn_blink = findViewById<Button>(R.id.btn_blink)
        var btn_move = findViewById<Button>(R.id.btn_move)
        var btn_slide = findViewById<Button>(R.id.btn_slide)

        btn_zoom.setOnClickListener(View.OnClickListener {
            var animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom)
            iv_img.startAnimation(animation);
        })
        btn_rotate.setOnClickListener(View.OnClickListener {
            var animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate)
            iv_img.startAnimation(animation);
        })
        btn_fade.setOnClickListener(View.OnClickListener {
            var animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade)
            iv_img.startAnimation(animation);
        })
        btn_blink.setOnClickListener(View.OnClickListener {
            var animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink)
            iv_img.startAnimation(animation);
        })
        btn_move.setOnClickListener(View.OnClickListener {
            var animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move)
            iv_img.startAnimation(animation);
        })
        btn_slide.setOnClickListener(View.OnClickListener {
            var animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide)
            iv_img.startAnimation(animation);
        })
    }
}
