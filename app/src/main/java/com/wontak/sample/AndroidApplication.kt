package com.wontak.sample

import com.wontak.sample.presentation.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class AndroidApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}