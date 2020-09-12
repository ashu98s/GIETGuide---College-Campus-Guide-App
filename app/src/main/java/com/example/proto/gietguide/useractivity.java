package com.example.proto.gietguide;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

@SuppressWarnings({"unused", "ConstantConditions"})
public class useractivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useractivity);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);


    }

    public void register(View v){
        Intent intent = new Intent(getApplication(),signup.class);
        startActivity(intent);
    }

    public void login(View v){
        Intent intent1 = new Intent(getApplication(),signin.class);
        startActivity(intent1);
    }
}



