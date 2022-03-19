package com.example.musicapp.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Rock(
    @SerializedName("resultCount")
    @Expose
    val resultCount: Int,
    @SerializedName("results")
    @Expose
    val results: List<Rock>
) {
    data class Rock(
        @SerializedName("artistId")
        @Expose
        val artistId: Int,
        @SerializedName("artistName")
        @Expose
        val artistName: String,
        @SerializedName("artistViewUrl")
        @Expose
        val artistViewUrl: String,
        @SerializedName("artworkUrl100")
        @Expose
        val artworkUrl100: String,
        @SerializedName("artworkUrl30")
        @Expose
        val artworkUrl30: String,
        @SerializedName("artworkUrl60")
        @Expose
        val artworkUrl60: String,
        @SerializedName("collectionCensoredName")
        @Expose
        val collectionCensoredName: String,
        @SerializedName("collectionExplicitness")
        @Expose
        val collectionExplicitness: String,
        @SerializedName("collectionId")
        @Expose
        val collectionId: Int,
        @SerializedName("collectionName")
        @Expose
        val collectionName: String,
        @SerializedName("collectionPrice")
        @Expose
        val collectionPrice: Double,
        @SerializedName("collectionViewUrl")
        @Expose
        val collectionViewUrl: String,
        @SerializedName("contentAdvisoryRating")
        @Expose
        val contentAdvisoryRating: String,
        @SerializedName("country")
        @Expose
        val country: String,
        @SerializedName("currency")
        @Expose
        val currency: String,
        @SerializedName("discCount")
        @Expose
        val discCount: Int,
        @SerializedName("discNumber")
        @Expose
        val discNumber: Int,
        @SerializedName("isStreamable")
        @Expose
        val isStreamable: Boolean,
        @SerializedName("kind")
        @Expose
        val kind: String,
        @SerializedName("previewUrl")
        @Expose
        val previewUrl: String,
        @SerializedName("primaryGenreName")
        @Expose
        val primaryGenreName: String,
        @SerializedName("releaseDate")
        @Expose
        val releaseDate: String,
        @SerializedName("trackCensoredName")
        @Expose
        val trackCensoredName: String,
        @SerializedName("trackCount")
        @Expose
        val trackCount: Int,
        @SerializedName("trackExplicitness")
        @Expose
        val trackExplicitness: String,
        @SerializedName("trackId")
        @Expose
        val trackId: Int,
        @SerializedName("trackName")
        @Expose
        val trackName: String,
        @SerializedName("trackNumber")
        @Expose
        val trackNumber: Int,
        @SerializedName("trackPrice")
        @Expose
        val trackPrice: Double,
        @SerializedName("trackTimeMillis")
        @Expose
        val trackTimeMillis: Int,
        @SerializedName("trackViewUrl")
        @Expose
        val trackViewUrl: String,
        @SerializedName("wrapperType")
        @Expose
        val wrapperType: String
    )
}