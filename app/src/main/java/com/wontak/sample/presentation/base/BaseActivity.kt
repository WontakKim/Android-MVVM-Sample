package com.wontak.sample.presentation.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import butterknife.ButterKnife
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity : DaggerAppCompatActivity() {

    @LayoutRes
    protected abstract fun getLayoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutRes())
        ButterKnife.bind(this)
    }
}
