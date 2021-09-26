package com.example.helloapp

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var txt1: TextView
    lateinit var txt2: TextView
    lateinit var txt3: TextView
    lateinit var txt4: TextView
    lateinit var txt5: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener(){
            changecolors()
        }


    }

    fun changecolors(){
        var color = 1
        var count = 0
        var colorarray = ArrayList<Int>()
        while(count<5){
            color = Color.argb(255,Random.nextInt(256),Random.nextInt(256),Random.nextInt(256))
            if (!(colorarray.contains(color))){
             colorarray.add(color)
                count++
            }
        }
        txt1 = findViewById(R.id.txt1)
        txt1.setTextColor(colorarray[0])
        txt2 = findViewById(R.id.txt2)
        txt2.setTextColor(colorarray[1])
        txt3 = findViewById(R.id.txt3)
        txt3.setTextColor(colorarray[2])
        txt4 = findViewById(R.id.txt4)
        txt4.setTextColor(colorarray[3])
        txt5 = findViewById(R.id.txt5)
        txt5.setTextColor(colorarray[4])
    }
}