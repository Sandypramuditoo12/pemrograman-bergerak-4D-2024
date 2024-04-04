package com.example.tugasmodul2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
    }

    fun onLanjutClicked(view: View) {
        val intent = Intent(this, halamanDua::class.java)
        startActivity(intent)
    }
}