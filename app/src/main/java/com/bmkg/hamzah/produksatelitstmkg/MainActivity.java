package com.bmkg.hamzah.produksatelitstmkg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

import static com.bmkg.hamzah.produksatelitstmkg.R.id.tabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tab = (TabHost) findViewById(tabHost);
        tab.setup();

        TabHost.TabSpec spec1 = tab.newTabSpec("REAL TIME");
        spec1.setIndicator("REAL TIME");
        spec1.setContent(R.id.layout1);
        tab.addTab(spec1);

        TabHost.TabSpec spec2 = tab.newTabSpec("LAST EVENT");
        spec2.setIndicator("LAST EVENT");
        spec2.setContent(R.id.layout2);
        tab.addTab(spec2);
    }
    public void cbklik (View view) {
        startActivity(new Intent(this,cbActivity.class));
    }
    public void vulkanikklik (View view) { startActivity(new Intent(this,vulkanikActivity.class)); }
    public void awanklik (View view) { startActivity(new Intent(this,awanActivity.class)); }
    public void asapklik (View view) { startActivity(new Intent(this,asapActivity.class)); }
    public void mccklik (View view) { startActivity(new Intent(this,mccActivity.class)); }
    public void rdcaklik (View view) { startActivity(new Intent(this,rdcaActivity.class)); }
    public void fogklik (View view) { startActivity(new Intent(this,fogActivity.class)); }
    public void hujanklik (View view) { startActivity(new Intent(this,hujanActivity.class)); }
    public void cblastklik (View view) { startActivity(new Intent(this,cblastActivity.class)); }
    public void awanlastklik (View view) { startActivity(new Intent(this,awanlastActivity.class)); }
    public void rdcalastklik (View view) { startActivity(new Intent(this,rdcalastActivity.class)); }
    public void vulkaniklastklik (View view) { startActivity(new Intent(this,vulkaniklastActivity.class)); }
    public void asaplastklik (View view) { startActivity(new Intent(this,asaplastActivity.class)); }
    public void mcclastklik (View view) { startActivity(new Intent(this,mcclastActivity.class)); }
    public void foglastklik (View view) { startActivity(new Intent(this,foglastActivity.class)); }
    public void hujanlastklik (View view) { startActivity(new Intent(this,hujanlastActivity.class)); }
    public void teamklik (View view) { startActivity(new Intent(this,teamActivity.class)); }
}
