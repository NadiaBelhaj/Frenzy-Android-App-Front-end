package com.nadia.frenzy.utils

import com.nadia.frenzy.R
import com.google.android.material.bottomnavigation.BottomNavigationView

object ShortcutUtils {

    private const val HOME_ACTION = "com.nadia.frenzy.action.home"
    private const val PROFILE_ACTION = "com.nadia.frenzy.action.profile"
    private const val POST_ACTION = "com.nadia.frenzy.action.post"

    fun executeAction(action : String, navigation : BottomNavigationView){
        when(action){
            HOME_ACTION -> navigation.selectedItemId = R.id.navigation_home
            
            PROFILE_ACTION -> navigation.selectedItemId = R.id.navigation_profile
            POST_ACTION -> navigation.selectedItemId = R.id.navigation_home
        }
    }
}