package com.example.musicapp.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Classic(
    @SerializedName("resultCount")
    @Expose
    val resultCount: Int,
    @SerializedName("results")
    @Expose
    val results: List<Classic>
) {
    data class Classic(
        @SerializedName("amgArtistId")
        @Expose
        val amgArtistId: Int,
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
        @SerializedName("collectionArtistId")
        @Expose
        val collectionArtistId: Int,
        @SerializedName("collectionArtistName")
        @Expose
        val collectionArtistName: String,
        @SerializedName("collectionArtistViewUrl")
        @Expose
        val collectionArtistViewUrl: String,
        @SerializedName("collectionCensoredName")
        @Expose
        val collectionCensoredName: String,
        @SerializedName("collectionExplicitness")
        @Expose
        val collectionExplicitness: String,
        @SerializedName("collectionHdPrice")
        @Expose
        val collectionHdPrice: Double,
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
        @SerializedName("copyright")
        @Expose
        val copyright: String,
        @SerializedName("country")
        @Expose
        val country: String,
        @SerializedName("currency")
        @Expose
        val currency: String,
        @SerializedName("description")
        @Expose
        val description: String,
        @SerializedName("discCount")
        @Expose
        val discCount: Int,
        @SerializedName("discNumber")
        @Expose
        val discNumber: Int,
        @SerializedName("hasITunesExtras")
        @Expose
        val hasITunesExtras: Boolean,
        @SerializedName("isStreamable")
        @Expose
        val isStreamable: Boolean,
        @SerializedName("kind")
        @Expose
        val kind: String,
        @SerializedName("longDescription")
        @Expose
        val longDescription: String,
        @SerializedName("previewUrl")
        @Expose
        val previewUrl: String,
        @SerializedName("primaryGenreName")
        @Expose
        val primaryGenreName: String,
        @SerializedName("releaseDate")
        @Expose
        val releaseDate: String,
        @SerializedName("shortDescription")
        @Expose
        val shortDescription: String,
        @SerializedName("trackCensoredName")
        @Expose
        val trackCensoredName: String,
        @SerializedName("trackCount")
        @Expose
        val trackCount: Int,
        @SerializedName("trackExplicitness")
        @Expose
        val trackExplicitness: String,
        @SerializedName("trackHdPrice")
        @Expose
        val trackHdPrice: Double,
        @SerializedName("trackHdRentalPrice")
        @Expose
        val trackHdRentalPrice: Double,
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
        @SerializedName("trackRentalPrice")
        @Expose
        val trackRentalPrice: Double,
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