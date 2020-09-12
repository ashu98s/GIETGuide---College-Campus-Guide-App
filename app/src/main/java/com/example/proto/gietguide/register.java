package com.example.proto.gietguide;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

@SuppressWarnings({"FieldCanBeLocal", "unused", "SimplifiableIfStatement", "ConstantConditions", "RedundantCast"})
public class register extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerlayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mDrawerlayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle =  new ActionBarDrawerToggle(register.this,mDrawerlayout,R.string.open,R.string.close);
        mDrawerlayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_drawer );
        navigationView.setNavigationItemSelectedListener( this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.about) {
            Intent intent = new Intent(register.this,about_app.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.developers) {
            Intent intent = new Intent(register.this,Developer.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.share) {
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            String shareBody  = "Your body here";
            String shareSub = "Your Subject here" ;
            share.putExtra(Intent.EXTRA_SUBJECT,shareSub);
            share.putExtra(Intent.EXTRA_SUBJECT,shareBody);
            startActivity(Intent.createChooser(share,"Share Using"));
        }
        if (id == R.id.rate){
            try {
                Uri uri = Uri.parse("market://details?id=" + getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(goToMarket);
            }
            catch (ActivityNotFoundException e){
                Uri uri = Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(goToMarket);
            }
        }
        if (id == R.id.exit) {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
            Toast.makeText(this,"oops!!", Toast.LENGTH_LONG).show();
            return true;
        }
        return false;
    }

    public void student_click(View v){
        Intent student = new Intent(getApplication(),useractivity.class);
        startActivity(student);
    }

    public void teacher_click(View v){
        Intent teacher = new Intent(getApplication(),useractivity.class);
        startActivity(teacher);
    }

    public void other_click(View v){
        Intent other = new Intent(getApplication(),useractivity.class);
        startActivity(other);
    }


}

