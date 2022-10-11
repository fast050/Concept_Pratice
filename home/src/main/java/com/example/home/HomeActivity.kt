package com.example.home

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.view.Window
import android.widget.Button
import com.example.detail.DetailActivity
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        config()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        findViewById<Button>(R.id.button).setOnClickListener {

            val options = ActivityOptions.makeSceneTransitionAnimation(
                this,
                it,
                "go" // The transition name to be matched in Activity B.
            )
            startActivity(Intent(this,DetailActivity::class.java), options.toBundle())

           // startActivity(Intent(this, DetailActivity::class.java))


        }

    }

    private fun config() {
        setExitSharedElementCallback(MaterialContainerTransformSharedElementCallback())
        // Keep system bars (status bar, navigation bar) persistent throughout the transition.
        window.sharedElementsUseOverlay = false
    }
}