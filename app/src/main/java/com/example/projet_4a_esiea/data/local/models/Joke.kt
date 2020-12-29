package com.example.projet_4a_esiea.data.local.models


import com.google.gson.annotations.SerializedName

data class Joke(
    @SerializedName("category")
    val category: String,
    @SerializedName("delivery")
    val delivery: String,
    @SerializedName("flags")
    val flags: Flags,
    @SerializedName("id")
    val id: Int,
    @SerializedName("joke")
    val joke: String,
    @SerializedName("lang")
    val lang: String,
    @SerializedName("safe")
    val safe: Boolean,
    @SerializedName("setup")
    val setup: String,
    @SerializedName("type")
    val type: String
)