package com.bmkg.hamzah.produksatelitstmkg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Hamzah on 3/15/2017.
 */

public class rdcalastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdcalast);
        WebView view = (WebView) this.findViewById(R.id.rdcalastgambar);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("https://2.bp.blogspot.com/-X7XU5CeArCA/WZraw9hQuSI/AAAAAAAAER8/dQq1ltyfcFcstF3U-MtwO_fRiar66pSQwCLcBGAs/s1600/rdca.jpg");
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
    }
}