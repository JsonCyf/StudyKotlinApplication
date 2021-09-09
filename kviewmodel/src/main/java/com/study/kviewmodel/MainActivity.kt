package com.study.kviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

//    private lateinit var tvNum:TextView
//
//    private lateinit var btnAdd:Button

    private val model: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        tvNum=findViewById(R.id.tv_num)
//        btnAdd=findViewById(R.id.btn_add)

//        tv_num.setText(model.number.toString())
//
//        btn_add.setOnClickListener (this)

    }

    override fun onClick(v: View?) {
//        when (v?.id) {
//            R.id.btn_add -> {
//                var num = model.number
//                num++
//                tv_num.text = num.toString()
//                model.number = num
//
//            }
//        }
    }
}