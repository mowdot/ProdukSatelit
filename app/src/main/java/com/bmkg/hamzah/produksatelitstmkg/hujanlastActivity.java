package com.bmkg.hamzah.produksatelitstmkg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Hamzah on 3/1/2017.
 */

public class hujanlastActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hujanlast);
        WebView view = (WebView) this.findViewById(R.id.hujanlastgambar);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("https://1.bp.blogspot.com/-onp10PkRYuE/WZ63f7tJsDI/AAAAAAAAETE/kVniwDc4V3wx1OfiyqREHWyFFrPHmSViACLcBGAs/s1600/cst.png");
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
    }
}
