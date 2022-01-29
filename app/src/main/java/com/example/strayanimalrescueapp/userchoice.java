package com.example.strayanimalrescueapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;

public class userchoice extends AppCompatActivity {

    Button btnclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userchoice);


        btnclick = findViewById(R.id.btn_click);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(userchoice.this,v_choice.class);
                startActivity(i);
            }
        });

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