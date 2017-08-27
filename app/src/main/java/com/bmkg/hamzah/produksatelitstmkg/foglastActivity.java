package com.bmkg.hamzah.produksatelitstmkg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Hamzah on 3/15/2017.
 */

public class foglastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foglast);
        WebView view = (WebView) this.findViewById(R.id.foglastgambar);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("https://1.bp.blogspot.com/-XJsVRmQODBs/WZrbFZCJHoI/AAAAAAAAESA/YdmuI3r84OMmhn0kjdp_pUK_4PlGBAKfQCLcBGAs/s1600/fog.jpg");
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
    }
}