package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView textview = findViewById(R.id.text_view);
        textview.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            login();
        }
    });
    }
    public void login() {
        // creat intent . switch information to  UserInfoActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}