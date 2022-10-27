package com.nadia.frenzy.utils

import com.nadia.frenzy.data.API_SERVER_URL

fun String.toServerImageUrl() : String{
    return this.replace("\\", "/")
}
