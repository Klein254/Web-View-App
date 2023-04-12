package com.example.simple_web_viewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Cooperative_bnk : AppCompatActivity() {

    lateinit var coopWeb:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        coopWeb = findViewById(R.id.coopWeb)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooperative_bnk)

        coopWeb = findViewById(R.id.coopWeb)

        val webSettings = coopWeb.settings
        webSettings.javaScriptEnabled = true
        coopWeb.loadUrl("")
    }
}