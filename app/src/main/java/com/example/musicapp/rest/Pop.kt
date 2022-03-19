package com.example.musicapp.rest

import io.reactivex.Single
import retrofit2.http.GET

interface Pop {
    /**
     * Right here i am getting data from the server
     *
     * using the single observable to make the asynchronous task
     */

    @GET(itunesPop)
    fun getPopMusic(itunesPop: String): Single<Pop>

    /**
     * Companion object will be handle the base url and the path
     */

    companion object{
        const val BASE_URL ="https://itunes.apple.com/"
        private const val itunesPop = "search?term=pop&amp;media=music&amp;entity=song&amp;limit=50"
    }
}