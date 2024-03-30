package com.example.visionopticals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    lateinit var titan:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        titan=findViewById(R.id.titan)

        titan.setOnClickListener{
            val intent =Intent(this,TitanActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}