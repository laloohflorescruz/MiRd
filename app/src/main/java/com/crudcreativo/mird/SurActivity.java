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
        sur.add(new Sur("Cuevas del Pomier"));
        sur.add(new Sur("Polo de Barahona"));
        sur.add(new Sur("Dunas de Bani"));
        sur.add(new Sur("Laguna de Oviedo"));
        sur.add(new Sur("Bahia de Las Aguilas"));
        sur.add(new Sur("Lago Enriquillo"));
        sur.add(new Sur("Balneario La Zurza"));
        sur.add(new Sur("Hoyo de Pelempito"));
        sur.add(new Sur("Isla Cabritos"));
        sur.add(new Sur("Bahia de Ocoa"));

        SurAdapter itemAdapter = new SurAdapter(this, sur);
        ListView listView = (ListView) findViewById(R.id.listview_sur);
        listView.setAdapter(itemAdapter);
    }
}