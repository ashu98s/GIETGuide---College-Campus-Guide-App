package com.example.proto.gietguide;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

@SuppressWarnings("ConstantConditions")
public class Admission extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Admission");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void btech(View v){
        Intent academic = new Intent(getApplication(),admission1.class);
        startActivity(academic);
    }
    public void diploma(View v){
        Intent academic = new Intent(getApplication(),admission2.class);
        startActivity(academic);
    }
    public void mtech(View v){
        Intent academic = new Intent(getApplication(),admission3.class);
        startActivity(academic);
    }
    public void helpline(View v){
        Intent academic = new Intent(getApplication(),admission4.class);
        startActivity(academic);
    }

}


