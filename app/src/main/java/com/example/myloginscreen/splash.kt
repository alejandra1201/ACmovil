package com.example.myloginscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        startimer()
    }
    fun startimer(){
        object: CountDownTimer( 2000, 1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                val intent = Intent(applicationContext, MainActivity::class.java).apply {}
                startActivity(intent)
            }

        }.start()
    }
}