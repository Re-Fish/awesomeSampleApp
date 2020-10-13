package com.example.myawesomeapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Log.e("@#$", "Button1 has been pressed")
            textView.setText("Button1 has been pressed")
        }
        button2.setOnClickListener {
            Log.e("@#$", "Button2 has been pressed")
            textView.setText("Button2 has been pressed")
        }
        button3.setOnClickListener {
            Log.e("@#$", "Button3 has been pressed")
            textView.setText("Button3 has been pressed")
        }
        button4.setOnClickListener {
            Log.e("@#$", "Button4 has been pressed")
            textView.setText("Button4 has been pressed")
        }
    }
}
