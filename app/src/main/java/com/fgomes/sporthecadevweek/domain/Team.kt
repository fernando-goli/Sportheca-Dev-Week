package com.fgomes.sporthecadevweek.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(
    @SerializedName("nome")
    val name: String,
    @SerializedName("imagem")
    val image: String,
    @SerializedName("forca")
    val stars: Int,
    var score: Int?
) : Parcelable
