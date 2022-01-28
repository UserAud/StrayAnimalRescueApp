package com.example.strayanimalrescueapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }


    public void nextActivity1(View v)
    {
        Intent i = new Intent(this, v_choice.class);
        startActivity(i);
    }

    public void nextActivity2(View v)
    {
        Intent i = new Intent(this, com.example.strayanimalrescueapp.userchoice.class);
        startActivity(i);
    }
    public void LogoutActivity(View v)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


}