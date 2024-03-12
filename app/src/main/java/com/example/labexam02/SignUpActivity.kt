package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signUpButton = findViewById<View>(R.id.imageViewSignUp) as ImageButton
        signUpButton.setOnClickListener { v ->
            val intent = Intent(v.context, LandingActivity::class.java)
            startActivity(intent)
        }

        val signInTextView = findViewById<View>(R.id.textViewSignIn) as TextView
        signInTextView.setOnClickListener { v ->
            val intent = Intent(v.context, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}