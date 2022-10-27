package com.nadia.frenzy.utils

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

private const val ASK_JOIN_DATE_FORMAT = "MMMM yyyy"
private const val ASK_POST_DATE_FORMAT = "dd MMMM yyyy 'at' HH:mm"

fun formatDateForJoin(time: Long): String {
   
    return dataFormat.format(date)
}

fun formatDateForPost(time: Long): String {
    
    return dataFormat.format(date)
}