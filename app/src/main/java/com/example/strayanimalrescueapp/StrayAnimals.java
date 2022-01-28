package com.example.strayanimalrescueapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.strayanimalrescueapp.adapter.SelectedAnimalAdapter;
import com.example.strayanimalrescueapp.adapter.StreetStarsAdapter;
import com.example.strayanimalrescueapp.model.SelectedAnimal;
import com.example.strayanimalrescueapp.model.StreetStars;

import java.util.ArrayList;
import java.util.List;

public class StrayAnimals extends AppCompatActivity {

    RecyclerView strayRecyclerView, selectedAnimalRecycler;
    StreetStarsAdapter streetStarsAdapter;
    List<StreetStars> streetStarsList;

    SelectedAnimalAdapter selectedAnimalAdapter;
    List<SelectedAnimal> selectedAnimalList;

    ImageView add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strayanimals);

        strayRecyclerView = findViewById(R.id.streetStarsRecycler);
        selectedAnimalRecycler = findViewById(R.id.selectedAnimalRecycler);

        add = findViewById(R.id.ic_add);

        //button to upload new animal
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(StrayAnimals.this, UploadStrayAnimal.class);
                startActivity(i);
                finish();

            }
        });

        //adding data to street stars model
        streetStarsList = new ArrayList<>();
        streetStarsList.add(new StreetStars(1, R.drawable.straydog1));
        streetStarsList.add(new StreetStars(2, R.drawable.straycat3));
        streetStarsList.add(new StreetStars(3, R.drawable.straycat4));
        streetStarsList.add(new StreetStars(4, R.drawable.straycat1));

        //adding data to selected animal model
        selectedAnimalList = new ArrayList<>();
        selectedAnimalList.add(new SelectedAnimal("Oyen",
                "1 y/o, male, domestic short hair, timid",
                "Subaidah USM","Sick","No",
                "25/01/2022 5.20 p.m.",R.drawable.straycat1));
        selectedAnimalList.add(new SelectedAnimal("Twinky",
                "Age unknown, male, domestic short hair",
                "Nearby Queensbay","Healthy","Yes",
                "24/01/2022 7.40 p.m.",R.drawable.straycat3));
        selectedAnimalList.add(new SelectedAnimal("Milo",
                "6 months, female, domestic short hair, fierce",
                "Clan Jetties Georgetown","Healthy","No",
                "24/01/2022 6.20 p.m.",R.drawable.straycat4));
        selectedAnimalList.add(new SelectedAnimal("Max",
                "2 y/o, female, domestic dog",
                "Taman Preston 3, Penang","Sick","Yes",
                "23/01/2022 2.10 p.m.",R.drawable.straydog1));





        setStreetStarsRecycler(streetStarsList);
        setSelectedAnimalRecycler(selectedAnimalList);

    }

    private void setStreetStarsRecycler(List<StreetStars> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        strayRecyclerView.setLayoutManager(layoutManager);
        streetStarsAdapter = new StreetStarsAdapter(this, dataList);
        strayRecyclerView.setAdapter(streetStarsAdapter);
    }

    private void setSelectedAnimalRecycler(List<SelectedAnimal> selectedDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        selectedAnimalRecycler.setLayoutManager(layoutManager);
        selectedAnimalAdapter = new SelectedAnimalAdapter(this, selectedDataList);
        selectedAnimalRecycler.setAdapter(selectedAnimalAdapter);
    }

}
