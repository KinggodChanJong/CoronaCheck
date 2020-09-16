package com.kang.coronacheck

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class QrCodeActivity : AppCompatActivity() {

    private lateinit var mWebView: WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrcode)

        val myWebView: WebView = findViewById(R.id.webView)
        myWebView.loadUrl("https://nid.naver.com/login/privacyQR/")

        val settings = myWebView.settings
        settings.javaScriptEnabled = true
        myWebView.webViewClient = WebViewClient() // 이거 있어야지 다른페이지로 주소가 넘어가도 동작 실행

        settings.domStorageEnabled = true
        settings.allowContentAccess = true


    }
}