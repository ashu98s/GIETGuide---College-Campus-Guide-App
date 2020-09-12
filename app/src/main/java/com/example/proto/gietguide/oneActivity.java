package com.example.proto.gietguide;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

@SuppressWarnings({"unused", "ConstantConditions"})
public class oneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About Us");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void about_us(View v){
        Intent academic = new Intent(getApplication(),aboutUs.class);
        startActivity(academic);
    }
    public void trust(View v){
        Intent academic = new Intent(getApplication(),trust.class);
        startActivity(academic);
    }
    public void msg_one(View v){
        Intent academic = new Intent(getApplication(),msgOne.class);
        startActivity(academic);
    }
    public void msg_two(View v){
        Intent academic = new Intent(getApplication(),msgTwo.class);
        startActivity(academic);
    }
    public void msg_three(View v){
        Intent academic = new Intent(getApplication(),msgThree.class);
        startActivity(academic);
    }
    public void msg_four(View v){
        Intent academic = new Intent(getApplication(),coreValues.class);
        startActivity(academic);
    }
}
