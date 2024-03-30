package com.example.visionopticals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TitanActivity : AppCompatActivity() {

    lateinit var titanimg:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_titan)


        titanimg=findViewById(R.id.image1)

        titanimg.setOnClickListener {
            val intent= Intent(this,CartActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}