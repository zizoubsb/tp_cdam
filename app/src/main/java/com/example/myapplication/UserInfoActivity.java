package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        // Retrieve the user information from the intent


        Intent intent = getIntent();
        String nom = intent.getStringExtra("nom");
        String prenom = intent.getStringExtra("prenom");
        String motDePasse = intent.getStringExtra("motDePasse");
        String email = intent.getStringExtra("email");
        String countryCode = intent.getStringExtra("countryCode");
        String phoneNumber = intent.getStringExtra("phoneNumber");


        // Display the user information on the UserInfoActivity
        TextView userInfoTextView = findViewById(R.id.userInfoTextView);
        String userInfo =  nom + "\n " + prenom + "\n" + motDePasse + "\n " + email +"\n " + phoneNumber;
        userInfoTextView.setText(userInfo);
    }
}
