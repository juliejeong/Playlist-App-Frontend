package com.example.playlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var position = -1
    private var title = ""
    private var body = ""
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager

//          TESTING THE FRAGMENTS AND STUFF
//        intent.extras?.let{
//            position = it.get("position") as Int
//            title = it.get("postTitle").toString()
//            body = it.get("postBody").toString()
//        }
//
//        button = findViewById(R.id.button)
//        button.setOnClickListener {
//            fragmentManager.beginTransaction().add(R.id.fragment_container, NotifFragment()).commit()
//        }
//
    }
}