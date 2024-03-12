package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signInButton = findViewById<View>(R.id.imageButtonSignIn) as ImageButton
        signInButton.setOnClickListener { v ->
            val intent = Intent(v.context, LandingActivity::class.java)
            startActivity(intent)
        }

        val signUpTextView = findViewById<TextView>(R.id.textViewSignUp) as TextView
        signUpTextView.setOnClickListener { v ->
            val intent = Intent(v.context, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}