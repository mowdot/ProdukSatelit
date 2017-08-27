package com.bmkg.hamzah.produksatelitstmkg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Hamzah on 3/15/2017.
 */

public class vulkaniklastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vulkaniklast);
        WebView view = (WebView) this.findViewById(R.id.vulkaniklastgambar);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("https://2.bp.blogspot.com/-g9EWZxKXI0M/WZrdZq9ZU_I/AAAAAAAAESQ/v8k8g7g3SwsZfHhHOWfq8XCvNkstYvBswCLcBGAs/s1600/vulkanik.jpg");
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
    }
}