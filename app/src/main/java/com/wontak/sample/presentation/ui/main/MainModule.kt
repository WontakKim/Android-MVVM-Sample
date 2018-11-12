package com.wontak.sample.presentation.ui.main

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainModule {

    @ContributesAndroidInjector
    abstract fun mainFragment(): MainFragment
}
