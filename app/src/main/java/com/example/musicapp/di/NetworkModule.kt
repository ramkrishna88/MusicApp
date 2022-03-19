package com.example.musicapp.di

import com.example.musicapp.rest.*
import com.google.gson.Gson
import  dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetworkModule {


    @Provides
    fun providesGson() = Gson()
    @Provides
    fun provideLoginInterceptor() = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    @Provides
    fun providesRequestInterceptor() = RequestInterceptor()

    @Provides
    fun providesOkHttpClient
                (requestInterceptor: RequestInterceptor,
                 loggingInterceptor: HttpLoggingInterceptor
    ):OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(requestInterceptor)
            .addInterceptor(loggingInterceptor)
            .connectTimeout(30,TimeUnit.SECONDS)
            .readTimeout(30,TimeUnit.SECONDS)
            .writeTimeout(30,TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    fun providesRetrofitService(okHttpClient: OkHttpClient,gson: Gson): Classic{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
            .create(Classic::class.java)


    }
    @Provides
    fun providesMusicRepository(classic: Classic):MusicRepository{
        return MusicRepositoryImpl(classic)
    }



}