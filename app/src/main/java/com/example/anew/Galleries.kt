package com.example.anew

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class Galleries : Fragment() {
    @SuppressLint("setJavaScriptEnabled")
//indicates that lint should ignor the specified warnings for elements



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_galleries, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val begin: WebView =view.findViewById(R.id.nav2)
        begin.webViewClient=object: WebViewClient(){

            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String

            ): Boolean {
                view.loadUrl(url)
                return true
            }


        }
        begin.loadUrl("https://stmark.sc.ug/mdd/")
        begin.settings.javaScriptEnabled=true
        begin.settings.allowContentAccess=true
        begin.settings.domStorageEnabled=true
        begin.settings.useWideViewPort=true
    }

}
