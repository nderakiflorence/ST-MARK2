package com.example.anew

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class Academics : Fragment() {
    @SuppressLint("setJavaScriptEnabled")
//indicates that lint should ignor the specified warnings for elements



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_academics, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val start: WebView =view.findViewById(R.id.nav4)
        start.webViewClient=object: WebViewClient(){

            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true
            }


        }
        start.loadUrl("https://stmark.sc.ug/high-achievers-page/")
        start.settings.javaScriptEnabled=true
        start.settings.allowContentAccess=true
        start.settings.domStorageEnabled=true
        start.settings.useWideViewPort=true
    }

}
