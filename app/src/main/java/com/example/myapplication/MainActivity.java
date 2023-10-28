package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // the spinner for country codes
        Spinner spinnerCountryCode = findViewById(R.id.spinnerCountryCode);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.country, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCountryCode.setAdapter(adapter);

        // Register button click event
        Button registerButton = findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
    }

    public void register() {
        EditText etNom = findViewById(R.id.Nom);
        EditText etPrenom = findViewById(R.id.Prenom);
        EditText etMotDePasse = findViewById(R.id.MotDePasse);
        EditText etEmail = findViewById(R.id.Email);
        Spinner spinnerCountryCode = findViewById(R.id.spinnerCountryCode);
        EditText etPhoneNumber = findViewById(R.id.PhoneNumber);

        String nom = etNom.getText().toString();
        String prenom = etPrenom.getText().toString();
        String motDePasse = etMotDePasse.getText().toString();
        String email = etEmail.getText().toString().trim();
        String countryCode = spinnerCountryCode.getSelectedItem().toString();
        String phoneNumber = etPhoneNumber.getText().toString();
        if (nom.isEmpty() || prenom.isEmpty() || motDePasse.isEmpty() || email.isEmpty() || phoneNumber.isEmpty()) {
            Toast.makeText(this, "Veuillez votre formelaire.", Toast.LENGTH_SHORT).show();
            return; // Exit the method if any field is empty
        }

        // creat intent . switch information to  UserInfoActivity
        Intent intent = new Intent(this, UserInfoActivity.class);
        intent.putExtra("nom", nom);
        intent.putExtra("prenom", prenom);
        intent.putExtra("motDePasse", motDePasse);
        intent.putExtra("email", email);
        intent.putExtra("countryCode", countryCode);
        intent.putExtra("phoneNumber", phoneNumber);
        startActivity(intent);
    }


}
