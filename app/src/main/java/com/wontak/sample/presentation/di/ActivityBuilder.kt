package com.wontak.sample.presentation.di

import com.wontak.sample.presentation.ui.main.MainActivity
import com.wontak.sample.presentation.ui.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity
}
