package com.example.musicapp.rest


import io.reactivex.Single
import retrofit2.http.GET

interface Classic {


    /**
     * Right here i am getting data from the server
     *
     * using the single observable to make the asynchronous task
     */

    @GET(itunesClassic)
    fun getClassicMusic() : Single<Classic>

    /**
     * Companion object will be handle the base url and the path
     */

    companion object{
        const val BASE_URL ="https://itunes.apple.com/"
        private const val itunesClassic = "search?term=classic&amp;media=music&amp;entity=song&amp;limit=50"
    }
}