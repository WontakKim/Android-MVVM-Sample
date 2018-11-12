package com.wontak.sample.presentation.di

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideName(): String {
        return "WONTAK"
    }
}
