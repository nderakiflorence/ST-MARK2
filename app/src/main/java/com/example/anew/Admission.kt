package com.example.anew

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class Admission : Fragment() {
    @SuppressLint("setJavaScriptEnabled")
//indicates that lint should ignor the specified warnings for elements



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admission, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val move: WebView =view.findViewById(R.id.nav5)
        move.webViewClient=object: WebViewClient(){

            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true
            }


        }
        move.loadUrl("https://stmark.sc.ug/admisionform/")
        move.settings.javaScriptEnabled=true
        move.settings.allowContentAccess=true
        move.settings.domStorageEnabled=true
        move.settings.useWideViewPort=true
    }

}
