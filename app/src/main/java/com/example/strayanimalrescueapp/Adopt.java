package com.example.strayanimalrescueapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Adopt extends AppCompatActivity {
    Button btn_adopt1, btn_adopt2, btn_adopt3, btn_adopt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt);

        btn_adopt1 = findViewById(R.id.btn_adopt1);
        btn_adopt2 = findViewById(R.id.btn_adopt2);
        btn_adopt3 = findViewById(R.id.btn_adopt3);
        btn_adopt4 = findViewById(R.id.btn_adopt4);

        btn_adopt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Adopt.this, AdoptUser.class);
                startActivity(i);
            }
        });

        btn_adopt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Adopt.this, AdoptUser.class);
                startActivity(i);
            }
        });

        btn_adopt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Adopt.this, AdoptUser.class);
                startActivity(i);
            }
        });

        btn_adopt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Adopt.this, AdoptUser.class);
                startActivity(i);
            }
        });
    }
}