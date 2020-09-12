package com.example.proto.gietguide;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TextView;

@SuppressWarnings({"ConstantConditions", "RedundantCast"})
public class Fest extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fest);

        final TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        //tab1
        TabHost.TabSpec spec = tabHost.newTabSpec("SPARKLE");
        spec.setContent(R.id.tab1);
        spec.setIndicator("SPARKLE");
        tabHost.addTab(spec);
        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Color.parseColor("#1669cf"));
        TextView tv = (TextView) tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).findViewById(android.R.id.title);
        tv.setTextColor(Color.WHITE);

        //tab2
        spec = tabHost.newTabSpec("GARIMA");
        spec.setContent(R.id.tab2);
        spec.setIndicator("GARIMA");
        tabHost.addTab(spec);


        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                int tab = tabHost.getCurrentTab();
                for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
                    // When tab is not selected
                    tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#444444"));
                    TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
                    tv.setTextColor(Color.WHITE);
                }
                // When tab is selected
                tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Color.parseColor("#FDD030"));
                TextView tv = (TextView) tabHost.getTabWidget().getChildAt(tab).findViewById(android.R.id.title);
                tv.setTextColor(Color.BLACK);
            }
        });

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Fest");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}


