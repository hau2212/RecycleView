package com.example.recyvleview;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private newAdapter newAdapter1;
    ArrayList<fromFood> fromFoods;
    LinearLayout linearLayout;

//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  recyclerView = findViewById(R.id.recycleview);

        for (int i = 0; i < fromFoods.size(); i++) {
            fromFoods.add(new fromFood("fads","sadf","àd","dfsầds",R.drawable.ic_launcher_background));

        }
        newAdapter1 = new newAdapter(fromFoods,this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(newAdapter1);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}