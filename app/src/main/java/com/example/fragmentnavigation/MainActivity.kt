package com.example.fragmentnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFirstFragment()
    }

    private fun loadFirstFragment() {
        val fragment1 = Fragment1()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container, fragment1, "Fragment1")
        fragmentTransaction.commit()
    }
}