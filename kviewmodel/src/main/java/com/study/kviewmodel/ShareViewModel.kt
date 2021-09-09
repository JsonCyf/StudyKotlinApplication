package com.study.kviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @class describe
 * @anthor Administrator
 * @time 2021/9/9 0009
 */
class ShareViewModel : ViewModel() {
    var count: MutableLiveData<Int> = MutableLiveData<Int>(0)

    fun add(n:Int){
        count.value=n
    }
}