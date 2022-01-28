package com.example.strayanimalrescueapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView droid = findViewById(R.id.stray);

    }

    public void next(View v)
    {
        Intent i = new Intent(this, com.example.strayanimalrescueapp.ui.login.LoginActivity.class);
        startActivity(i);
    }
}