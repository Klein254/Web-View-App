package com.example.simple_web_viewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ABSA : AppCompatActivity() {
    lateinit var absaWeb: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_absa)

        absaWeb = findViewById(R.id.absaWeb)

        val webSettings = absaWeb.settings
        webSettings.javaScriptEnabled = true
        absaWeb.loadUrl("https://www.co-opbank.co.ke/")
    }
}