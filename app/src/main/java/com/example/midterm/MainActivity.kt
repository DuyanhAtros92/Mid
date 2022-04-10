package com.example.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt = findViewById<TextView>(R.id.secondaryClockId)
        val primary =findViewById<TextClock>(R.id.primaryClockId)
        val btn = findViewById<Button>(R.id.getTimeBtnId)
        val simpleDateFormat = SimpleDateFormat("hh:mm:ss a")
        val currentDateAndTime: String = simpleDateFormat.format(Date())
        txt.text = currentDateAndTime
        btn.setOnClickListener {
            txt.text =  primary.text


        }

    }
}