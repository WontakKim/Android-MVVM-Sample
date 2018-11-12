package com.wontak.sample.presentation.di

import com.wontak.sample.presentation.ui.main.MainActivity
import com.wontak.sample.presentation.ui.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity(): MainActivity
}
