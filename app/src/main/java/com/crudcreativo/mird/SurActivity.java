package com.crudcreativo.mird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sur);


        ArrayList<String> sur = new ArrayList<String>();

        sur.add("Cuevas del Pomier");
        sur.add("Polo de Barahona");
        sur.add("Dunas de Bani");
        sur.add("Laguna de Oviedo");
        sur.add("Bahia de Las Aguilas");
        sur.add("Lago Enriquillo");
        sur.add("Balneario La Zurza");
        sur.add("Hoyo de Pelempito");
        sur.add("Isla Cabritos");
        sur.add("Bahia de Ocoa");


        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for (int index = 0; index < sur.size(); index++) {
            TextView surView = new TextView(this);
            surView.setText(sur.get(index));
            rootView.addView(surView);
        }
    }
}