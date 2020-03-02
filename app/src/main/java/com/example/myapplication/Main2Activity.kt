package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    internal lateinit var leftplayer = 0
    internal lateinit var rightplayer = 0
    internal lateinit var leftscore = 0
    internal lateinit var rightscore = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)
        val rightscard = findViewById<ImageView>(R.id.imageView4)
        val leftcard = findViewById<ImageView>(R.id.imageView3)
        val dealb = findViewById<ImageView>(R.id.button)
        val scoreleft = findViewById<ImageView>(R.id.textView)
        val scoreright = findViewById<ImageView>(R.id.textView2)
    }
        fun dealbutton(view: View){

        }
    }


}
