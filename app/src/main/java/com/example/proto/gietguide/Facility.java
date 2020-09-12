package com.example.proto.gietguide;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

@SuppressWarnings({"unused", "ConstantConditions"})
public class Facility extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Facilities");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void centrallibrary(View v){
        Intent csebtn = new Intent(getApplication(),facility_1.class);
        startActivity(csebtn);
    }
    public void hostel(View v){
        Intent mechbtn = new Intent(getApplication(),facility_2.class);
        startActivity(mechbtn);
    }
    public void transportation(View v){
        Intent eebtn = new Intent(getApplication(),facility_3.class);
        startActivity(eebtn);
    }
    public void bank(View v){
        Intent ecebtn = new Intent(getApplication(),facility_4.class);
        startActivity(ecebtn);
    }
    public void gym(View v){
        Intent civilbtn = new Intent(getApplication(),facility_5.class);
        startActivity(civilbtn);
    }
    public void sports(View v){
        Intent eeebtn = new Intent(getApplication(),facility_6.class);
        startActivity(eeebtn);
    }
    public void canteen(View v){
        Intent eeebtn = new Intent(getApplication(),facility_7.class);
        startActivity(eeebtn);
    }
    public void computercenter(View v){
        Intent eeebtn = new Intent(getApplication(),facility_8.class);
        startActivity(eeebtn);
    }
    public void medical(View v){
        Intent eeebtn = new Intent(getApplication(),facility_9.class);
        startActivity(eeebtn);
    }
    public void wifi(View v){
        Intent eeebtn = new Intent(getApplication(),facility_10.class);
        startActivity(eeebtn);
    }
    public void security(View v){
        Intent eeebtn = new Intent(getApplication(),facility_11.class);
        startActivity(eeebtn);
    }


}

