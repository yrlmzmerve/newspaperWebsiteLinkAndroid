package com.example.sebnem.haberapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebSite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_site);
        WebView webView = (WebView) findViewById(R.id.Site);
        String site_id = HaberSayfasi.ID;

        webView.getSettings().setJavaScriptEnabled(true);

        switch (site_id){
            case "0":
                webView.loadUrl("http://www.cnnturk.com/");
                break;
            case "1":
                webView.loadUrl("http://www.haberturk.com/");
                break;
            case "2":
                webView.loadUrl("http://www.hurriyet.com.tr/");
                break;
            case "3":
                webView.loadUrl("http://www.milliyet.com.tr/");
                break;
            case "4":
                webView.loadUrl("https://www.nytimes.com/?mcubz=2");
                break;
            case "5":
                webView.loadUrl("http://www.posta.com.tr/");
                break;
            case "6":
                webView.loadUrl("http://www.sabah.com.tr/");
                break;
            default:
                break;
        }
    }
}
