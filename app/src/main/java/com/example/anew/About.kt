package com.example.anew

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class About : Fragment() {
    @SuppressLint("setJavaScriptEnabled")
//indicates that lint should ignor the specified warnings for elements



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val run: WebView =view.findViewById(R.id.nav3)
        run.webViewClient=object: WebViewClient(){

            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true
            }


        }
        run.loadUrl("https://stmark.sc.ug/core-values/")
        run.settings.javaScriptEnabled=true
        run.settings.allowContentAccess=true
        run.settings.domStorageEnabled=true
        run.settings.useWideViewPort=true
    }

}
