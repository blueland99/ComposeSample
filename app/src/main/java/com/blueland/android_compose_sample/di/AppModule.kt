package com.blueland.android_compose_sample.di

import com.blueland.android_compose_sample.data.remote.APIService
import com.blueland.android_compose_sample.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAPIService(): APIService {
        return RetrofitClient.apiService
    }
}