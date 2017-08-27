package com.bmkg.hamzah.produksatelitstmkg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Hamzah on 3/2/2017.
 */

public class mccActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcc);
        WebView view = (WebView) this.findViewById(R.id.mccgambar);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("https://3.bp.blogspot.com/-935iBZo_cOs/WLe76mNNVSI/AAAAAAAADkw/evnL3eNNC8cbFDyUZqSdKRIcqgCc4hn_wCLcB/s1600/on%2Bprogress.png");
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
    }
}
