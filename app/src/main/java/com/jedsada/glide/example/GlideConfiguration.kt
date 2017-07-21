package com.jedsada.glide.example

import android.content.Context
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.RequestOptions

class GlideConfiguration : AppGlideModule() {
    override fun applyOptions(context: Context?, builder: GlideBuilder?) {
        val rquestOptions = RequestOptions.placeholderOf(android.R.color.black)
        builder?.setDefaultRequestOptions(rquestOptions)
    }
}