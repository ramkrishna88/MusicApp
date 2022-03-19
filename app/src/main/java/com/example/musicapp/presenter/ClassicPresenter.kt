package com.example.musicapp.presenter

import com.example.musicapp.rest.MusicRepository
import dagger.Provides
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class ClassicPresenterImpl @Inject constructor(
    private val musicRepository: MusicRepository,
    private val disposable:CompositeDisposable
) : ClassicPresenter {



    private var peopleViewContract: PeopleViewContract? = null
    override fun initializePresenter(viewContract: PeopleViewContract) {
        peopleViewContract =viewContract
    }

    override fun checkNetworkPresenter() {
        TODO("Not yet implemented")
    }

    override fun getClassicMusic() {
        musicRepository.getClassic()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { character -> this.peopleViewContract?.charactersSuccess((musicRepository.getClassic()))},
                {  error -> this.peopleViewContract?.onError(error)  }
            )
            .apply {
                this@ClassicPresenterImpl.disposable.add(this)
            }
    }

    override fun destroyPresenter() {
        peopleViewContract =null
        disposable.clear()


    }

}


interface ClassicPresenter{
    fun initializePresenter(viewContract: PeopleViewContract)
    fun checkNetworkPresenter()
    fun getClassicMusic()
    fun destroyPresenter()



}
    interface PeopleViewContract{
        fun loadingCharacter(isLoading:Boolean)
        fun charactersSuccess (characters: Single<com.example.musicapp.rest.Classic>)
        fun onError(error: Throwable)
    }
