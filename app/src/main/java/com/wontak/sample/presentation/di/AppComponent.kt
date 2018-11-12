package com.wontak.sample.presentation.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBindingModule::class,
    ViewModelModule::class
])
interface AppComponent: AndroidInjector<DaggerApplication> {

    @Component.Builder
    abstract class Builder: AndroidInjector.Builder<DaggerApplication>()
}
