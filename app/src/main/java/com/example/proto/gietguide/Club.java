package com.example.proto.gietguide;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

@SuppressWarnings({"unused", "ConstantConditions"})
public class Club extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Clubs");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void sportsclub(View v){
        Intent csebtn = new Intent(getApplication(),club1.class);
        startActivity(csebtn);
    }
    public void code(View v){
        Intent mechbtn = new Intent(getApplication(),club2.class);
        startActivity(mechbtn);
    }
    public void robotics(View v){
        Intent eebtn = new Intent(getApplication(),club3.class);
        startActivity(eebtn);
    }
    public void innovation(View v){
        Intent ecebtn = new Intent(getApplication(),club4.class);
        startActivity(ecebtn);
    }
    public void music(View v){
        Intent civilbtn = new Intent(getApplication(),club5.class);
        startActivity(civilbtn);
    }
    public void art(View v){
        Intent eeebtn = new Intent(getApplication(),club6.class);
        startActivity(eeebtn);
    }
    public void dance(View v){
        Intent eeebtn = new Intent(getApplication(),club7.class);
        startActivity(eeebtn);
    }
    public void social(View v){
        Intent eeebtn = new Intent(getApplication(),club8.class);
        startActivity(eeebtn);
    }
    public void photography(View v){
        Intent eeebtn = new Intent(getApplication(),club9.class);
        startActivity(eeebtn);
    }
    public void hubby(View v){
        Intent eeebtn = new Intent(getApplication(),club10.class);
        startActivity(eeebtn);
    }
    public void scholarship(View v){
        Intent eeebtn = new Intent(getApplication(),club11.class);
        startActivity(eeebtn);
    }
    public void council(View v){
        Intent eeebtn = new Intent(getApplication(),club12.class);
        startActivity(eeebtn);
    }
    public void swachh(View v){
        Intent eeebtn = new Intent(getApplication(),club13.class);
        startActivity(eeebtn);
    }
    public void ragging(View v){
        Intent eeebtn = new Intent(getApplication(),club14.class);
        startActivity(eeebtn);
    }

}



