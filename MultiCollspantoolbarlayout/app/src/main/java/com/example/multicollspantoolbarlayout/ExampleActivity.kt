package com.example.multicollspantoolbarlayout

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ExampleActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)
    }

    companion object {
        fun createIntent(context: Context) : Intent = Intent(context, ExampleActivity::class.java)
    }
}
