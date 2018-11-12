package com.wontak.sample.presentation.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wontak.sample.databinding.FragmentMainBinding
import com.wontak.sample.presentation.base.BaseFragment
import com.wontak.sample.presentation.di.ViewModelFactory
import javax.inject.Inject

class MainFragment : BaseFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.restoreInstanceState(savedInstanceState)

        binding = FragmentMainBinding.inflate(inflater, container, false).apply {
            data = viewModel
            setLifecycleOwner(this@MainFragment)
        }

        return binding.root
    }
}