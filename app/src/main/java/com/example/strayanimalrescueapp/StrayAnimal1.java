package com.example.strayanimalrescueapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class StrayAnimal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stray_animal1);
    }

    public void update_situation(View v){
        Intent i = new Intent(this, UpdateSituation.class);
        startActivity(i);
    }
}