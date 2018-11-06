package com.wontak.sample

import com.wontak.sample.presentation.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class AndroidApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }
}