package com.wontak.sample.presentation.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.os.Bundle
import javax.inject.Inject

class MainViewModel
@Inject constructor() : ViewModel() {

    val counter = MutableLiveData<Int>()

    var number = 0

    fun restoreInstanceState(savedInstanceState: Bundle?) {}

    fun onButtonClick() = counter.setValue(++number)
}