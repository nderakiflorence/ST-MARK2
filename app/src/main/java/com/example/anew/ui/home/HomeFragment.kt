package com.example.anew.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.anew.R
import com.example.anew.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    @SuppressLint("setJavaScriptEnabled")
//indicates that lint should ignor the specified warnings for elements



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val start: WebView =view.findViewById(R.id.nav1)
        start.webViewClient=object: WebViewClient(){

            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true
            }


        }
        start.loadUrl("https://stmark.sc.ug/")
        start.settings.javaScriptEnabled=true
        start.settings.allowContentAccess=true
        start.settings.domStorageEnabled=true
        start.settings.useWideViewPort=true
    }

}

