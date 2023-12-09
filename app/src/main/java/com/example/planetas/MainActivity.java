package com.example.planetas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<Planet> planets;
    private static CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);
        planets = new ArrayList<>();
        planets.add(new Planet("Mercury", "0 Moons", R.drawable.mercury));
        planets.add(new Planet("Venus", "0 Moons", R.drawable.venus));
        planets.add(new Planet("Earth", "1 Moon", R.drawable.earth));
        planets.add(new Planet("Mars", "2 Moons", R.drawable.mars));
        planets.add(new Planet("Jupiter", "79 Moons", R.drawable.jupiter));
        planets.add(new Planet("Saturn", "83 Moons", R.drawable.saturn));
        planets.add(new Planet("Uranus", "27 Moons", R.drawable.uranus));
        planets.add(new Planet("Neptune", "14 Moons", R.drawable.neptune));

        adapter = new CustomAdapter(planets, getApplicationContext());

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Planet Name: " + adapter.getItem(i).getPlanetName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}