package com.busur.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView myCountriesList;
    CountriesAdapter myAdapter;
    ArrayList<Countries> myCountries = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCountries.add(new Countries("", "Khartoum", "Sudan"));
        myCountries.add(new Countries("", "Cairo", "Egypt"));
        myCountries.add(new Countries("", "Mogadishu", "Somalia"));
        myCountries.add(new Countries("", "Khartoum", "Sudan"));
        myCountries.add(new Countries("", "Cairo", "Egypt"));
        myCountries.add(new Countries("", "Mogadishu", "Somalia"));


        //now create your recyclerview
        myCountriesList = findViewById(R.id.rv_list_of_countries);
        CountriesAdapter adapter = new CountriesAdapter(MainActivity.this, myCountries);
        myCountriesList.setLayoutManager(new LinearLayoutManager(this));
        myCountriesList.setAdapter(adapter);


    }
}