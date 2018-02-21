package com.example.bernardosalgueiro.activitystacktest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        title = "Activity B"
        init()
    }

    private fun init() {
        val openA = findViewById<Button>(R.id.activityBOpenA)
        openA.setOnClickListener({
            startActivity(Intent(this, MainActivity::class.java))
        })
    }
}
