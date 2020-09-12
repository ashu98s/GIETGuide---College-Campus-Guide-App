package com.example.proto.gietguide;

import android.database.sqlite.SQLiteDatabase;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

@SuppressWarnings({"WeakerAccess", "unused", "ConstantConditions"})
public class signup extends AppCompatActivity {

    EditText editText1, editText2, editText3, editText4;
    SQLiteDatabase db = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editText1 = findViewById(R.id.editTextName);
        editText2 = findViewById(R.id.editTextEmail);
        editText3 = findViewById(R.id.editTextPassword);
        editText4 = findViewById(R.id.editConfirmPassword);

        db = openOrCreateDatabase("college", MODE_PRIVATE, null);
        db.execSQL("create table if not exists user_master(name varchar(25),email varchar(30),password varchar(15),confirmpassword varchar(15))");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Sign Up");


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);


    }

    public void signup_button(View v){
        String name = editText1.getText().toString();
        String email = editText2.getText().toString();
        String password = editText3.getText().toString();
        String confirmpassword = editText4.getText().toString();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmpassword.isEmpty()){
            Snackbar.make(v,"please fill all the fields", Snackbar.LENGTH_LONG).show();
        }
        else {
            Snackbar.make(v,"Registration Successful",Snackbar.LENGTH_LONG).show();
        }

        db.execSQL("insert into user_master values ('"+name+"','"+email+"','"+password+"','"+confirmpassword+"')");

    }




}



