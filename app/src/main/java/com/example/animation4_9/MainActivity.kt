package com.example.animation4_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initViewsVaz1()
        initViewsVaz2()
        initViewsVaz3()
        initViewsVaz4()
        initViewsVaz5()
        initViewsVaz6()
    }
    fun initViews(){
        var btn_dars = findViewById<Button>(R.id.btn_dars)
        btn_dars.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, DarsActivity::class.java)
            startActivity(intent)
        })
    }
    fun initViewsVaz1(){
        var btn_vaz1 = findViewById<Button>(R.id.btn_vaz1)
        btn_vaz1.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Vazifa1Activity::class.java)
            startActivity(intent)
        })
    }
    fun initViewsVaz2(){
        var btn_vaz2 = findViewById<Button>(R.id.btn_vaz2)
        btn_vaz2.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Vazifa2Activity::class.java)
            startActivity(intent)
        })
    }
    fun initViewsVaz3(){
        var btn_vaz3 = findViewById<Button>(R.id.btn_vaz3)
        btn_vaz3.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Vazifa3Activity::class.java)
            startActivity(intent)
        })
    }
    fun initViewsVaz4(){
        var btn_vaz4 = findViewById<Button>(R.id.btn_vaz4)
        btn_vaz4.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Vazifa4Activity::class.java)
            startActivity(intent)
        })
    }
    fun initViewsVaz5(){
        var btn_vaz5 = findViewById<Button>(R.id.btn_vaz5)
        btn_vaz5.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Vazifa5Activity::class.java)
            startActivity(intent)
        })
    }
    fun initViewsVaz6(){
        var btn_vaz6 = findViewById<Button>(R.id.btn_vaz6)
        btn_vaz6.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, Vazifa6Activity::class.java)
            startActivity(intent)
        })
    }

}