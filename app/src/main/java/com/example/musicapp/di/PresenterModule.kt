package com.example.musicapp.di

import com.example.musicapp.presenter.ClassicPresenter
import com.example.musicapp.presenter.ClassicPresenterImpl
import com.example.musicapp.rest.MusicRepository
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

@Module
class PresenterModule {

    @Provides
    fun providesCompositeDisposable() = CompositeDisposable()

    @Provides
    fun providesCharacterPresenters(musicRepository:MusicRepository, disposable: CompositeDisposable): ClassicPresenter{
        return ClassicPresenterImpl(musicRepository,disposable)
    }
}