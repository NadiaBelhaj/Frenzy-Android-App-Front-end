package com.nadia.frenzy.data

import com.google.gson.annotations.SerializedName

data class PasswordBody(
    @SerializedName("id")
    val id : String,

    @SerializedName("password")
    val password : String
)