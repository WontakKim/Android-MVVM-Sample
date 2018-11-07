package com.wontak.sample.presentation.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import com.wontak.sample.R
import com.wontak.sample.presentation.base.BaseFragment
import com.wontak.sample.presentation.di.ViewModelFactory
import javax.inject.Inject

class MainFragment : BaseFragment() {

    @BindView(R.id.label_name)
    lateinit var textLabel: TextView

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: MainViewModel

    override fun getLayoutRes(): Int {
        return R.layout.fragment_main
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.restoreInstanceState(savedInstanceState)
    }
}