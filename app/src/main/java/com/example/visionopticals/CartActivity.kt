package com.example.visionopticals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CartActivity : AppCompatActivity() {

    lateinit var withGST:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        withGST=findViewById(R.id.withGST)

        withGST.setOnClickListener {
            val intent= Intent(this,BillActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}