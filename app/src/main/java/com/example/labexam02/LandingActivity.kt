package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        val addTaskButton: AppCompatButton = findViewById(R.id.addTaskBtn)
        val addLectureButton: AppCompatButton = findViewById(R.id.addLectureBtn)

        addTaskButton.setOnClickListener {
            val intent = Intent(this, NewTaskActivity::class.java)
            startActivity(intent)
        }

        addLectureButton.setOnClickListener {
            val intent = Intent(this, NewTimeTableActivity::class.java)
            startActivity(intent)
        }
    }
}