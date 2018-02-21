package com.example.bernardosalgueiro.activitystacktest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        title = "Activity C"
        init()
    }

    private fun init() {
        val openA = findViewById<Button>(R.id.activityCOpenA)
        openA.setOnClickListener({
            startActivity(Intent(this, MainActivity::class.java))
        })
    }

}