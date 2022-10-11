package com.example.detail

import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ContentFrameLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.transition.platform.MaterialContainerTransform
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback

class DetailActivity  :AppCompatActivity(){

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {

        config()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        val hostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController= hostFragment.navController


        setupActionBarWithNavController(navController)
    }


    private fun config(){
        findViewById<ContentFrameLayout>(android.R.id.content).transitionName = "go"
        setEnterSharedElementCallback(MaterialContainerTransformSharedElementCallback())
        val trasform = MaterialContainerTransform()
        trasform.addTarget(android.R.id.content)
        trasform.setDuration(500)

        window.sharedElementEnterTransition = trasform
        window.sharedElementReturnTransition = trasform
    }
}