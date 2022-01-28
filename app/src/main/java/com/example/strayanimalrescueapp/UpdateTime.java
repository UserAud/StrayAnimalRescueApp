package com.example.strayanimalrescueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UpdateTime extends AppCompatActivity {
    Button save, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_time);

        save = findViewById(R.id.feeding_time_save);
        cancel = findViewById(R.id.feeding_time_cancel);

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