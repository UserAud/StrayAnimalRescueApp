package com.example.strayanimalrescueapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Claim extends AppCompatActivity {
    Button save, cancel;
    EditText bill_amount, claim_username, claim_animals;
    ImageView receipt_image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim);

        save = findViewById(R.id.claim_save);
        cancel = findViewById(R.id.claim_cancel);
        bill_amount = findViewById(R.id.bill_amont);
        claim_username = findViewById(R.id.claim_user);
        claim_animals = findViewById(R.id.claim_animal);
        receipt_image = findViewById(R.id.receipt);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Save Successfully!", Toast.LENGTH_SHORT).show();

            }
        });

        cancel.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Action Cancelled.", Toast.LENGTH_LONG).show();
            }
        });
    }
}