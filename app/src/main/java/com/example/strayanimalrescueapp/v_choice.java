package com.example.strayanimalrescueapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class v_choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vchoice);
    }
    public void v_choice1(View v)
    {
        Intent i = new Intent(this, UploadStrayAnimal.class);
        startActivity(i);
    }

    public void v_choice2(View c){
        Intent i = new Intent(this, com.example.strayanimalrescueapp.AnimalList.class);
        startActivity(i);
    }

    public void v_choice3(View v)
    {
        Intent i = new Intent(this, com.example.strayanimalrescueapp.Claim.class);
        startActivity(i);
    }
}