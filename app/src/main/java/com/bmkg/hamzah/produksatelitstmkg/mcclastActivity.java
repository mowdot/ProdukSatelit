package com.bmkg.hamzah.produksatelitstmkg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Hamzah on 3/15/2017.
 */

public class mcclastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcclast);
        WebView view = (WebView) this.findViewById(R.id.mcclastgambar);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("https://4.bp.blogspot.com/-V2_ByGAjJAs/WZrba7dsxqI/AAAAAAAAESE/N31cntvmx2YQ_gA-qKorJYwBNfz5egZeQCLcBGAs/s1600/mcc.jpg");
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
    }
}