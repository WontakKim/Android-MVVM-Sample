package com.wontak.sample.presentation.di

import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    fun provideName(): String {
        return "WONTAK"
    }
}
