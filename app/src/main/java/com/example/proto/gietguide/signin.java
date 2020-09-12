package com.example.proto.gietguide;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

@SuppressWarnings({"ConstantConditions", "WeakerAccess"})
public class signin extends AppCompatActivity {

    EditText editText1,editText2;
    SQLiteDatabase db = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        editText1 = findViewById(R.id.editTextEmail);
        editText2 = findViewById(R.id.editTextPassword);
        db = openOrCreateDatabase("college",MODE_PRIVATE,null);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Sign In");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void signin_button(View v){
        String email = editText1.getText().toString();
        String password = editText2.getText().toString();

        @SuppressLint("Recycle") Cursor cursor = db.rawQuery("select * from user_master where email='"+email+"' and password='"+password+"'",null);
        boolean status = cursor.moveToNext();
        if (status){
            String str = cursor.getString(cursor.getColumnIndex("email"));
            if (email.equals(str)){
                Intent intent = new Intent(getApplication(),HomeActivity.class);
                intent.putExtra("email",str);
                startActivity(intent);
            }
            else {
                Snackbar.make(v,"Try Again", Snackbar.LENGTH_LONG).show();
            }
        }
        else {
            Snackbar.make(v,"Invalid Details",Snackbar.LENGTH_LONG).show();
        }

    }



}





