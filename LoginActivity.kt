package com.apoorav.tomatosaver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    lateinit var gso : GoogleSignInOptions
    lateinit var gsc : GoogleSignInClient

    lateinit var et_email : TextInputEditText
    lateinit var et_pass : TextInputEditText
    lateinit var btn_login : Button
    lateinit var btn_signup : TextView
   // lateinit var btn_glogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_login)

        et_email = findViewById(R.id.form_field)
        et_pass = findViewById(R.id.form_field1)
        btn_login = findViewById(R.id.btn_login)
        btn_signup = findViewById(R.id.signup)

        btn_login.setOnClickListener(){
            val intent = Intent(this, FarmerHomePage::class.java)
            startActivity(intent)
            finish()
        }

        btn_signup.setOnClickListener(){
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slideup, R.anim.slideleftexit)
            finish()
        }
      //  btn_glogin = findViewById(R.id.btn_glogin)

//        gso  = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build()
//        gsc  = GoogleSignIn.getClient(this, gso)

//        btn_glogin.setOnClickListener(){
//            signIn()
//        }


    }

//    fun signIn(){
//        val intent: Intent = gsc.signInIntent
//        startActivityForResult(intent, 1000)
//        finish()
//
//    }
}