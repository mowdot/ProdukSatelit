package com.bmkg.hamzah.produksatelitstmkg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Hamzah on 3/3/2017.
 */

public class awanlastActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awanlast);
        WebView view = (WebView) this.findViewById(R.id.awanlastgambar);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("https://2.bp.blogspot.com/-vc7QYMInwBA/WZ63df1a-0I/AAAAAAAAETA/uInIM0b7pXwB5I8hEc6HZ8thn9whffc7QCLcBGAs/s1600/tipeawan.png");
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
    }
}
