package com.peacecodes.kodebonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtSee: TextView = findViewById(R.id.txtSee)
        txtSee.setOnClickListener(){showImage(it)}
    }

    fun showImage(view: View) {
        val image1: ImageView = findViewById(R.id.imageView1)
        val image2: ImageView = findViewById(R.id.imageView2)
        val text: TextView = findViewById(R.id.text)

        view.visibility = View.GONE
        image1.visibility = View.VISIBLE
        image2.visibility = View.VISIBLE
        text.visibility = View.VISIBLE
    }
}