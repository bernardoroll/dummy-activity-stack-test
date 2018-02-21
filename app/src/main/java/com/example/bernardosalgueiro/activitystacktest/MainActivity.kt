package com.example.bernardosalgueiro.activitystacktest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Activity A"
        init()
    }

    private fun init() {
        val openA = findViewById<Button>(R.id.mainActivityOpenB)
        openA.setOnClickListener({
            startActivity(Intent(this, ActivityB::class.java))
        })
        val openC = findViewById<Button>(R.id.mainActivityOpenC)
        openC.setOnClickListener({
            startActivity(Intent(this, ActivityC::class.java))
        })
    }
}
