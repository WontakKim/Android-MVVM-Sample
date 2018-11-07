package com.wontak.sample.presentation.ui.main

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector
    abstract fun bindMainFragment(): MainFragment
}
