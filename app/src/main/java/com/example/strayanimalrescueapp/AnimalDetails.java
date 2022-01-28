package com.example.strayanimalrescueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalDetails extends AppCompatActivity {

    ImageView img,back;
    TextView aniName, aniDesc, aniLocation, aniStatus, aniNeutered, aniFeed;

    String name,desc,location,status,neutered,feed;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);

        Intent i = getIntent();
        name = i.getStringExtra("name");
        image = i.getIntExtra("image",R.drawable.straycat1);
        desc = i.getStringExtra("desc");
        location = i.getStringExtra("location");
        status = i.getStringExtra("status");
        neutered = i.getStringExtra("neutered");
        feed = i.getStringExtra("feed");

        aniName = findViewById(R.id.animalName);
        aniDesc = findViewById(R.id.animDesc);
        aniLocation = findViewById(R.id.animLocation);
        aniStatus = findViewById(R.id.animStatus);
        aniNeutered = findViewById(R.id.animalNeutered);
        aniFeed = findViewById(R.id.animLastFeed);
        img = findViewById(R.id.detail_image);
        back = findViewById(R.id.back2);

        aniName.setText(name);
        aniDesc.setText(desc);
        aniLocation.setText(location);
        aniStatus.setText(status);
        aniNeutered.setText(neutered);
        aniFeed.setText(feed);
        img.setImageResource(image);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(AnimalDetails.this, StrayAnimals.class);
                startActivity(i);
                finish();

            }
        });

    }
}