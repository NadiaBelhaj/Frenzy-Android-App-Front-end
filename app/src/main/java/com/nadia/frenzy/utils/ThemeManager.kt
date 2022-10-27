package com.nadia.frenzy.utils

import android.app.Activity

object ThemeManager {

    fun setUserTheme(activity : Activity){
        activity.setTheme(ThemeFactory.getThemeStyle(color))
    }
}