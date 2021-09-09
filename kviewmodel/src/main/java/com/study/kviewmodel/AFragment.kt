package com.study.kviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import kotlinx.android.synthetic.main.fragment_a.*

class AFragment : Fragment(), View.OnClickListener {

    private val model: ShareViewModel by activityViewModels()
    private var n = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onResume() {
        super.onResume()
        btn_addf.setOnClickListener(this)

        tv_counta.text = model.count.value.toString()

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_addf -> {
                n++
                model.add(n)
                tv_counta.text = n.toString()
            }
        }
    }


}