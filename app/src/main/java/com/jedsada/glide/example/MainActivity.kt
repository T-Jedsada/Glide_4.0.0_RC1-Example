package com.jedsada.glide.example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val requestOptions = RequestOptions
                .placeholderOf(android.R.color.darker_gray)
                .error(android.R.color.darker_gray)
                .format(DecodeFormat.PREFER_ARGB_8888)

        Glide.with(this)
                .setDefaultRequestOptions(requestOptions)
                .load("https://goo.gl/7kaJ3J")
                .into(img_test)
    }
}
