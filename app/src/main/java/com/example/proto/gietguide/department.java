package com.example.proto.gietguide;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

@SuppressWarnings({"unused", "ConstantConditions"})
public class department extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Departments");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void computer(View v){
        Intent csebtn = new Intent(getApplication(),ComputerSc.class);
        startActivity(csebtn);
    }
    public void mechanical(View v){
        Intent mechbtn = new Intent(getApplication(),Mechanical.class);
        startActivity(mechbtn);
    }
    public void ee(View v){
        Intent eebtn = new Intent(getApplication(),ee.class);
        startActivity(eebtn);
    }
    public void ece(View v){
        Intent ecebtn = new Intent(getApplication(),ece.class);
        startActivity(ecebtn);
    }
    public void civil(View v){
        Intent civilbtn = new Intent(getApplication(),civilEngg.class);
        startActivity(civilbtn);
    }
    public void eee(View v){
        Intent eeebtn = new Intent(getApplication(),eee.class);
        startActivity(eeebtn);
    }
    public void cse(View v){
        Intent eeebtn = new Intent(getApplication(),cseMtech.class);
        startActivity(eeebtn);
    }
    public void msd(View v){
        Intent eeebtn = new Intent(getApplication(),mshMtech.class);
        startActivity(eeebtn);
    }
    public void ped(View v){
        Intent eeebtn = new Intent(getApplication(),pedMtech.class);
        startActivity(eeebtn);
    }
    public void structure(View v){
        Intent eeebtn = new Intent(getApplication(),StructureMtech.class);
        startActivity(eeebtn);
    }






}


