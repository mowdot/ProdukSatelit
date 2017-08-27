package com.bmkg.hamzah.produksatelitstmkg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Hamzah on 3/1/2017.
 */

public class cblastActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cblast);
        WebView view = (WebView) this.findViewById(R.id.cblastgambar);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("https://4.bp.blogspot.com/-93fAABlx0qA/WZrYDYaOxYI/AAAAAAAAERs/AezwN1S8zHMlLHIQzzQD3HGJYLfQMcWkwCLcBGAs/s1600/test3.png");
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
    }
}
