package com.example.strayanimalrescueapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UploadStrayAnimal extends AppCompatActivity {
    ImageView back;
    Button submit, upload;
    int SELECT_IMAGE_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_stray_animal);

        back = findViewById(R.id.backInUpload);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(UploadStrayAnimal.this, StrayAnimals.class);
                startActivity(i);
                finish();
            }
        });

        upload = findViewById(R.id.uploadAnimalImg);
        upload.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent,"Title"),SELECT_IMAGE_CODE);
            }
        });


        submit = findViewById(R.id.submitNewAnimal);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(UploadStrayAnimal.this, StrayAnimals.class);
                startActivity(i);
                finish();
            }
        });


    }
}