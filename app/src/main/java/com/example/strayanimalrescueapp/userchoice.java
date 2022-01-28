package com.example.strayanimalrescueapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class userchoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userchoice);

    }

    public void choice1(View v)
    {
        Intent i = new Intent(this, Donate.class);
        startActivity(i);
    }
    public void choice2(View v)
    {
        Intent i = new Intent(this, Adopt.class);
        startActivity(i);
    }

    public void choice3(View v)
    {
        Intent i = new Intent(this, Report.class);
        startActivity(i);
    }

    public void choiceViewInfo(View v)
    {
        Intent i = new Intent(this, StrayAnimals.class);
        startActivity(i);
    }

}