package com.example.animation4_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.animation.AnimationUtils

class Vazifa1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vazifa1)

        initViews()
    }
    fun initViews(){
        var btn_bounce = findViewById<Button>(R.id.btn_bounce)
        btn_bounce.setOnClickListener(View.OnClickListener {
            var animation = android.view.animation.AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce)
            btn_bounce.startAnimation(animation);
        })
    }
}