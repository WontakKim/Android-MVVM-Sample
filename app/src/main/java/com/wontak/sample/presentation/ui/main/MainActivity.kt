package com.wontak.sample.presentation.ui.main

import android.os.Bundle
import android.widget.TextView
import butterknife.BindView
import com.wontak.sample.R
import com.wontak.sample.presentation.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var name: String

    override fun getLayoutRes(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_main, MainFragment())
            .commit()
    }
}
