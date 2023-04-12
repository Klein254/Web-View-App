package com.example.simple_web_viewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class KCB : AppCompatActivity() {
    lateinit var kcbWeb:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcb)

        kcbWeb = findViewById(R.id.kcbWeb)

        val webSettings = kcbWeb.settings
        webSettings.javaScriptEnabled = true
        kcbWeb.loadUrl("https://ke.kcbgroup.com/")

    }
}