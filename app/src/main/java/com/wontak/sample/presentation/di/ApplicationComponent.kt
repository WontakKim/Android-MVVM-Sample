package com.wontak.sample.presentation.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
    AndroidSupportInjectionModule::class,
    ApplicationModule::class,
    ActivityBuilder::class
))
interface ApplicationComponent: AndroidInjector<DaggerApplication> {

    @Component.Builder
    abstract class Builder: AndroidInjector.Builder<DaggerApplication>()
}
