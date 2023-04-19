package com.sc.programtest

import android.text.TextUtils
import java.lang.Exception
import java.text.DecimalFormat

fun String.toAmount():String{
    if(TextUtils.isEmpty(this)){
        return ""
    }else{
        return DecimalFormat.getInstance().format(this.toLongValue())
    }

}
fun String.toTime():String{
    if(TextUtils.isEmpty(this)){
        return ""
    }else{
        val value = this.toLongValue()
        return if(value>60){
            "${value/60}m${value%60}s"
        }else{
            "${value%60}s"
        }

    }
}
fun String.toLongValue():Long{
    try {
        return this.toLong()
    }catch (e:Exception){
        return 0L
    }
}