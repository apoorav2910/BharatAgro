package com.apoorav.tomatosaver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class FarmerHomePage : AppCompatActivity() {
    lateinit var track : ImageView
    lateinit var addcrop : TextView
    lateinit var verify : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        setContentView(R.layout.activity_farmer_home_page)

        track = findViewById(R.id.tracker)
        verify = findViewById(R.id.ver)
        addcrop = findViewById(R.id.add_crop1)
        track.setOnClickListener(){
            val intent = Intent(this, CropDetails::class.java)
            startActivity(intent)
        }
        verify.setOnClickListener(){
            Toast.makeText(this,"Your ID will be verified soon!", Toast.LENGTH_SHORT).show()
        }
        addcrop.setOnClickListener(){
            val intent1 = Intent(this, AddNewCrop::class.java)
            startActivity(intent1)
        }


        var prof : ImageView = findViewById(R.id.prof)
        prof.setOnClickListener(){
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        val mycrop : ImageView = findViewById(R.id.mycrop)
        mycrop.setOnClickListener(){
            val intent = Intent(this, CropDetails::class.java)
            startActivity(intent)
        }
    }
}