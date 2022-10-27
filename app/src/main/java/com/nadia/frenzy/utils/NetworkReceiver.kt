package com.nadia.frenzy.utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NetworkReceiver(private val listener: NetworkStateListener) : BroadcastReceiver() {

    override fun onReceive(context : Context) {
        if (isNetworkConnected(context)){
            
        }else{
            listener.onNetworkDisconnected()
        }
    }
}