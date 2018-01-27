package com.crudcreativo.mird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sur);


        ArrayList<Sur> sur = new ArrayList<Sur>();
        sur.add(new Sur("Cuevas del Pomier", R.drawable.cueva_pomier));
        sur.add(new Sur("Dunas de Bani", R.drawable.dunas_bani));
        sur.add(new Sur("Laguna de Oviedo", R.drawable.laguna_oviedo));
        sur.add(new Sur("Bahia de Las Aguilas", R.drawable.bahia_aguilas));
        sur.add(new Sur("Lago Enriquillo", R.drawable.lago_enriquillo));
        sur.add(new Sur("Balneario La Zurza", R.drawable.lazurza));
        sur.add(new Sur("Hoyo de Pelempito", R.drawable.pelempito));

        SurAdapter itemAdapter = new SurAdapter(this, sur);
        ListView listView = (ListView) findViewById(R.id.listview_sur);
        listView.setAdapter(itemAdapter);
    }
}