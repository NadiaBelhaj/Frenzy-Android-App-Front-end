package com.nadia.frenzy.utils

import com.nadia.frenzy.R
import com.nadia.frenzy.data.ThemeColor

object ThemeFactory {

    fun getThemeStyle(themeColor: ThemeColor) : Int{
        return when(themeColor){
            ThemeColor.BLACK -> R.style.BlackTheme
            ThemeColor.GREEN -> R.style.GreenTheme
            ThemeColor.PURPLE -> R.style.PurpleTheme
        }
    }
}