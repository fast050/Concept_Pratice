package com.example.conceptpratice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conceptpratice.customview.CustomTextView
import com.example.home.HomeActivity

class MainActivity : AppCompatActivity() {

    lateinit var customTextView: CustomTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customTextView=findViewById(R.id.textOnScreen)



        startActivity(Intent(this , HomeActivity::class.java))

    }
}