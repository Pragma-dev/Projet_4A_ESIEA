package com.example.projet_4a_esiea.data.local.models


import com.google.gson.annotations.SerializedName

data class RestJokeResponse(
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("jokes")
    val jokes: List<Joke>
)