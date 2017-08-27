package com.bmkg.hamzah.produksatelitstmkg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class hujanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hujan);
        WebView view = (WebView) this.findViewById(R.id.hujangambar);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("http://103.60.180.23/cst.png");
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
    }
}
