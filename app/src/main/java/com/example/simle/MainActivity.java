package com.example.simle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
WebView webView;
String url = "https://eacad.org";
    public static final String USER_AGENT = "Mozilla/5.0 (Linux; Android 4.1.1; Galaxy Nexus Build/JRO03C) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=findViewById(R.id.we);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setFocusable(true);

        webView.getSettings().setUserAgentString(USER_AGENT);
        webView.getSettings().setUseWideViewPort(true);
        webView.setInitialScale(1);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
    @Override
    public void onBackPressed() {

        if(webView.canGoBack()) {
            webView.goBack();
        }
        else {
            super.onBackPressed();
        }

    }
}
