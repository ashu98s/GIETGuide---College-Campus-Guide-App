package com.example.proto.gietguide;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgress = findViewById(R.id.progress_bar);

        new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
                finish();
            }
        }).start();


    }
    private void doWork(){
        for (int progress=0;progress<100;progress+=50){
            try{
                Thread.sleep(1000);
                mProgress.setProgress(progress);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private void startApp(){
        Intent intent = new Intent(MainActivity.this,register.class);
        startActivity(intent);
    }

}


