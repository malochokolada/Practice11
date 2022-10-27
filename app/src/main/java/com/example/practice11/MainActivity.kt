package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var isChecked = false

    fun onClick(view : View){
        val photo : ImageView = findViewById<ImageView>(R.id.imageView2);
        photo.setImageResource(R.drawable.catsleeping);
        if(isChecked){
            photo.setImageResource(R.drawable.catsleeping)
            isChecked = !isChecked
        }
    }

    var on: Boolean = true

    fun onClickImage(view: View){
        val btnImage: ImageButton = findViewById(R.id.imageButton)
        if (on)
        {
            btnImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.btn_check_buttonless_off))
            on=false
        }
        else {
            btnImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.btn_check_buttonless_on))
            on=true
        }
    }


}