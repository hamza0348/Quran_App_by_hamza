package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class paraActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<HModel> modleList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para);


        recyclerView = findViewById(R.id.rv_home);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(paraActivity.this);


        recyclerView.setLayoutManager(layoutManager);
        modleList = new ArrayList<>();

        modleList.add(new HModel("hamza","1", ""));




        HAdopter adopter = new HAdopter(modleList, paraActivity.this);
        recyclerView.setAdapter(adopter);





    }
}