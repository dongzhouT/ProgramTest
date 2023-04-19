package com.sc.programtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var tvAmount:TextView
    lateinit var tvTime:TextView
    lateinit var edtAmount:EditText
    lateinit var edtTime:EditText
    lateinit var btnSubmit:Button
    val AMOUNT = "Amount:"
    val TIME = "Time:"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        tvAmount = findViewById(R.id.tv_amount)
        tvTime = findViewById(R.id.tv_time)
        edtAmount = findViewById(R.id.edt_amount)
        edtTime = findViewById(R.id.edt_time)
        btnSubmit.setOnClickListener(this)
        edtAmount.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                //do nothing
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                //do nothing
            }

            override fun afterTextChanged(s: Editable?) {
                //do nothing
                tvAmount.text = "$AMOUNT${s.toString().toAmount()}"
            }

        })
        edtTime.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                //do nothing
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                //do nothing
            }

            override fun afterTextChanged(s: Editable?) {
                //do nothing
                tvTime.text = "$TIME${s.toString().toTime()}"
            }

        })
    }

    override fun onClick(v: View) {
        when(v.id){
            //跳转activity
            R.id.btn_submit->startActivity(Intent(this@MainActivity,ResultActivity::class.java))
        }
    }
}