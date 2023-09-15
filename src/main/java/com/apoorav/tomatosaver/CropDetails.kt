package com.apoorav.tomatosaver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CropDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_crop_details)
    }
}