package com.bmkg.hamzah.produksatelitstmkg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Hamzah on 3/15/2017.
 */

public class asaplastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asaplast);
        WebView view = (WebView) this.findViewById(R.id.asaplastgambar);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("https://4.bp.blogspot.com/-sLNqSvMFOTc/WZrX2UZTMHI/AAAAAAAAERo/hxpxRjlRtVw0b3IfFAdrpQR26ONiVm1GQCLcBGAs/s1600/300.png");
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
    }
}