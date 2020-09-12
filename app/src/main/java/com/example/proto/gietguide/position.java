package com.example.proto.gietguide;

import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

@SuppressWarnings({"WeakerAccess", "CanBeFinal", "ConstantConditions", "RedundantCast"})
public class position extends AppCompatActivity {

    ListView lst;
    String[] names = {"Prof.(Dr.) Mohan Charan Panda",
            "Prof. Bikash Chandra patnaik",
            "Prof.(Dr.) Jibanananda Jena",
            "Prof. Chandan Kumar Sethi",
            "Prof.(Dr.) Anil kumar Mishra",
            "Prof.(Dr.) Pritinika Behera",
            "Prof.(Dr.) Pradyumna K. Sahoo",
            "Prof.(Dr.) Balaji Prasad Padhi",
            "Prof. Jyotisankar Kalia",
            "Prof.(Dr.) Sruti Ranjan Mishra",
            "Prof. Binay Kumar Panigrahi"};
    String[] desc = {"Principal, B.Tech","Principal, Diploma","Dean Academic","Academic Coordinator","HOD, CSE","HOD, MECH","HOD, EE","HOD, EEE","HOD, ECE","HOD,BSH","HOD, CE"};
    Integer[] imgid = {R.drawable.principal,
            R.drawable.diploma,
            R.drawable.dean,
            R.drawable.coordinator,
            R.drawable.csehod,
            R.drawable.mechhod,
            R.drawable.eehod,
            R.drawable.eeehod,
            R.drawable.ecehod,
            R.drawable.hodbsh,
            R.drawable.hodce};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_position);

        lst = (ListView) findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter();
        lst.setAdapter(customAdapter);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Academic Positions");

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
            return imgid.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint({"ViewHolder", "InflateParams"})
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.listview_layout,null);

            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            TextView textView_name = (TextView) view.findViewById(R.id.name);
            TextView textView_desc = (TextView) view.findViewById(R.id.description);

            imageView.setImageResource(imgid[i]);
            textView_name.setText(names[i]);
            textView_desc.setText(desc[i]);

            return view;
        }
    }
}



