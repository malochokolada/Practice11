package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var isChecked = false

    fun onClick(view : View){
        val photo : ImageView = findViewById<ImageView>(R.id.imageView2);
        val image: Int = R.drawable.catsleeping;
        val butt=findViewById<Button>(R.id.button)
        photo.setImageResource(R.drawable.catsleeping);
        if(isChecked){
            photo.setImageResource(R.drawable.catsleeping)
            isChecked = !isChecked
        }
    }

   /* private ImageView mImageView;
    mImageView = (ImageView) findViewById(R.id.imageView2);

    fun onClick2(view: View) {
        val butt=findViewById<Button>(R.id.button)

        if (isChecked){
            btn1.visibility = View.INVISIBLE
            btn2.visibility = View.VISIBLE
            isChecked = !isChecked
        }
        else
        {
            btn2.visibility = View.INVISIBLE
            btn1.visibility = View.VISIBLE
            isChecked = !isChecked
        }*/
}