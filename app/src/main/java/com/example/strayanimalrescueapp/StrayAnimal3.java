package com.example.strayanimalrescueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StrayAnimal3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stray_animal3);
    }

    public void update_situation(View v){
        Intent i = new Intent(this, UpdateSituation.class);
        startActivity(i);
    }

    public void update_time(View v){
        Intent i = new Intent(this, UpdateTime.class);
        startActivity(i);
    }
}