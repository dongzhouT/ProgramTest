package com.sc.programtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    var result:Long = 0
    lateinit var tvResult:TextView
    companion object{
        const val EXTRA_RESULT = "result"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        result = intent.getLongExtra(EXTRA_RESULT,0)
        tvResult = findViewById(R.id.tv_result)
        tvResult.text = "$result"
    }
}