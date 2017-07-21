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

        Glide.with(this)
                .load("https://www.cesarsway.com/sites/newcesarsway/files/styles/large_article_preview/public/Common-dog-behaviors-explained.jpg?itok=FSzwbBoi")
                .into(img_one)

        val requestOptions = RequestOptions.formatOf(DecodeFormat.DEFAULT)

        Glide.with(this)
                .setDefaultRequestOptions(requestOptions)
                .asGif()
                .load("https://upload-assets.vice.com/files/2016/09/01/1472761701GIPHY.gif")
                .into(img_two)
    }
}
