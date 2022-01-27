package com.example.strayanimalrescueapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UpdateSituation extends AppCompatActivity {

    Button save, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_situation);

        save = findViewById(R.id.situation_save);
        cancel = findViewById(R.id.situation_cancel);

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

    public void back(View view){
        Intent i = new Intent(this, StrayAnimal1.class);
        startActivity(i);
    }
}