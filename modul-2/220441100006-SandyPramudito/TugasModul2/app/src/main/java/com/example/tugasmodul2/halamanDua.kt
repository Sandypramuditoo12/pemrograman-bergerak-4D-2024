package com.example.tugasmodul2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class halamanDua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_dua)
    }

    fun goToPageThree(view: View?) {
        val intent = Intent(
            this,
            HalamanTiga::class.java
        )
        startActivity(intent)
    }

}