package com.example.musicapp.rest

import android.os.Parcel
import android.os.Parcelable
import io.reactivex.Single

interface MusicRepository {
    fun getClassic(): Single<Classic>
    fun getPop() : Single<Pop>
    fun getRock() : Single<Rock>
}
    class MusicRepositoryImpl(
    private val classic: Classic
) : MusicRepository,  Classic,Pop,Rock{




        override fun getClassic(): Single<Classic> {
        return classic.getClassicMusic()
    }

        override fun getPop(): Single<Pop> {
            return getPop()
        }

        override fun getRock(): Single<Rock> {
            return getRock()
        }

        override fun getClassicMusic(): Single<Classic> {
            return classic.getClassicMusic()

        }

        override fun getPopMusic(itunesPop: String): Single<Pop> {
            return getPopMusic(itunesPop)
        }

        override fun getRockMusic(itunesRock: Rock): Single<Pop> {
            return getRockMusic(itunesRock)
        }

    }







