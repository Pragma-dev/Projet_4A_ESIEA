package com.example.projet_4a_esiea.data.local.models


import com.google.gson.annotations.SerializedName

data class Flags(
    @SerializedName("explicit")
    val explicit: Boolean,
    @SerializedName("nsfw")
    val nsfw: Boolean,
    @SerializedName("political")
    val political: Boolean,
    @SerializedName("racist")
    val racist: Boolean,
    @SerializedName("religious")
    val religious: Boolean,
    @SerializedName("sexist")
    val sexist: Boolean
)