package com.example.proto.gietguide;

import android.annotation.SuppressLint;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

@SuppressWarnings({"WeakerAccess", "CanBeFinal", "ConstantConditions", "RedundantCast"})
public class civilEngg extends AppCompatActivity {

    ListView listView;

    int[] images = {R.drawable.teacher,
            R.drawable.teacher,
            R.drawable.mam,
            R.drawable.mam,
            R.drawable.teacher,
            R.drawable.teacher,
            R.drawable.mam,
            R.drawable.teacher,
            R.drawable.mam,

    };
    String[] Name = {"Prof.Binaya Kumar Panigrahi, HOD",
            "Prof. Satya Sankar Swain",
            "Prof. Lovely Sabat",
            "Prof. Prafusmita Sahoo",
            "Prof. Chittaranjan Mallick",
            "Prof. Soumya Ranjan Satapathy",
            "Prof. Chinmayee Das",
            "Prof. Ramakrushna Sahu",
            "prof. Sangita pani"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_engg);

        listView = (ListView) findViewById(R.id.listcse);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);



        final TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        //tab1
        TabHost.TabSpec spec = tabHost.newTabSpec("ABOUT");
        spec.setContent(R.id.tab1);
        spec.setIndicator("ABOUT");
        tabHost.addTab(spec);
        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Color.parseColor("#1669cf"));
        TextView tv = (TextView) tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).findViewById(android.R.id.title);
        tv.setTextColor(Color.WHITE);

        //tab2
        spec = tabHost.newTabSpec("HOD'S DESK");
        spec.setContent(R.id.tab2);
        spec.setIndicator("HOD'S DESK");
        tabHost.addTab(spec);


        //tab3
        spec = tabHost.newTabSpec("FACULTY");
        spec.setContent(R.id.tab3);
        spec.setIndicator("FACULTY");
        tabHost.addTab(spec);

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener(){
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
        getSupportActionBar().setTitle("Civil Engineering");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            @SuppressLint({"InflateParams", "ViewHolder"}) View view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imgview);
            TextView textView = (TextView) view.findViewById(R.id.textview);

            imageView.setImageResource(images[position]);
            textView.setText(Name[position]);
            return view;
        }
    }
}









