package com.example.yummy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.yummy.adapter.RecycleViewAdapter;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerData[] recyclerData = new RecyclerData[]{
                new RecyclerData("Kesar Pista Phirni","veg",R.drawable.kesari_pista_phirni, "1"),
                new RecyclerData("Almond And Rose Kheer","veg", R.drawable.almond_and_rose_kheer, "2"),
                new RecyclerData("Korean Egg Roll","Non-Veg",R.drawable.korean_egg_roll, "3"),
                new RecyclerData("Samosa","veg",R.drawable.samosa, "4"),
                new RecyclerData("Crispy Herb Chicken","Non-Veg",R.drawable.crispy_herb_chicken, "5"),
                new RecyclerData("Korean BibimBap","Non-Veg",R.drawable.korean_bibimbap, "6"),
                new RecyclerData("Veg Hakka Noodles","veg",R.drawable.veg_hakka_noodles, "7"),
                new RecyclerData("Til-E-Paneer","veg",R.drawable.til_e_paneer, "8"),
                new RecyclerData("Super Food Salad","veg",R.drawable.super_food_salad, "9")

        };

        RecycleViewAdapter myAdapter = new RecycleViewAdapter(recyclerData,HomeActivity.this);
        recyclerView.setAdapter(myAdapter);

    }
}