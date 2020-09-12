package com.example.proto.gietguide;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

@SuppressWarnings("unused")
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void aboutus(View v){
        Intent csebtn = new Intent(getApplication(),oneActivity.class);
        startActivity(csebtn);
    }
    public void academic(View v){
        Intent mechbtn = new Intent(getApplication(),twoActivity.class);
        startActivity(mechbtn);
    }
    public void department(View v){
        Intent eebtn = new Intent(getApplication(),department.class);
        startActivity(eebtn);
    }
    public void infrastructure(View v){
        Intent ecebtn = new Intent(getApplication(),Facility.class);
        startActivity(ecebtn);
    }
    public void placement(View v){
        Intent civilbtn = new Intent(getApplication(),placement.class);
        startActivity(civilbtn);
    }
    public void admission(View v){
        Intent eeebtn = new Intent(getApplication(),Admission.class);
        startActivity(eeebtn);
    }
    public void fest(View v){
        Intent csebtn = new Intent(getApplication(),Fest.class);
        startActivity(csebtn);
    }
    public void club(View v){
        Intent mechbtn = new Intent(getApplication(),Club.class);
        startActivity(mechbtn);
    }
    public void notice(View v){
        Intent eebtn = new Intent(getApplication(),notice.class);
        startActivity(eebtn);
    }
    public void development(View v){
        Intent ecebtn = new Intent(getApplication(),rndActivity.class);
        startActivity(ecebtn);
    }
    public void contact(View v){
        Intent civilbtn = new Intent(getApplication(),contact.class);
        startActivity(civilbtn);
    }
}
