package com.example.proto.gietguide;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

@SuppressWarnings({"unused", "ConstantConditions"})
public class twoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Academic");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void university(View v){
        Intent academic = new Intent(getApplication(),academic.class);
        startActivity(academic);
    }
    public void position(View v){
        Intent academic = new Intent(getApplication(),position.class);
        startActivity(academic);
    }
    public void course(View v){
        Intent academic = new Intent(getApplication(),courses.class);
        startActivity(academic);
    }
    public void regulation(View v){
        Intent academic = new Intent(getApplication(),regulations.class);
        startActivity(academic);
    }
    public void awardss(View v){
        Intent academic = new Intent(getApplication(),awards.class);
        startActivity(academic);
    }
    public void teaching(View v){
        Intent academic = new Intent(getApplication(),teaching.class);
        startActivity(academic);
    }
    public void calender(View v){
        Intent academic = new Intent(getApplication(),calender.class);
        startActivity(academic);
    }
    public void route(View v){
        Intent academic = new Intent(getApplication(),route.class);
        startActivity(academic);
    }
    public void publish(View v){
        Intent academic = new Intent(getApplication(),publications.class);
        startActivity(academic);
    }
    public void faculty(View v){
        Intent academic = new Intent(getApplication(),development.class);
        startActivity(academic);
    }
    public void seminar(View v){
        Intent academic = new Intent(getApplication(),seminar.class);
        startActivity(academic);
    }

}


