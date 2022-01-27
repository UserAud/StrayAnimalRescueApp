package com.example.strayanimalrescueapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AnimalList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_list);
    }
    public void animal_oyen(View v){
        Intent i = new Intent(this, com.example.strayanimalrescueapp.StrayAnimal1.class);
        startActivity(i);
    }

    public void animal_milo(View v){
        Intent i = new Intent(this, com.example.strayanimalrescueapp.StrayAnimal1.class);
        startActivity(i);
    }

    public void animal_max(View v){
        Intent i = new Intent(this, com.example.strayanimalrescueapp.StrayAnimal1.class);
        startActivity(i);
    }

    public void animal_twinky(View v){
        Intent i = new Intent(this, com.example.strayanimalrescueapp.StrayAnimal1.class);
        startActivity(i);
    }
}