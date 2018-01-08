package com.crudcreativo.mird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ListView;


import java.util.ArrayList;

public class EsteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_este);

        ArrayList<Este> este = new ArrayList<Este>();
        este.add(new Este("Playa Boca Chica"));
        este.add(new Este("Cueva de las Maravillas"));
        este.add(new Este("Casa de Campo"));
        este.add(new Este("Isla Saona"));
        este.add(new Este("Isla Catalina"));
        este.add(new Este("Altos de Chavon"));
        este.add(new Este("Oyo Azul"));
        este.add(new Este("Playa Bayahibe"));
        este.add(new Este("Basilica de La Altagracia"));
        este.add(new Este("Cuevas Fun-Fun"));
        este.add(new Este("Playa Juanillo"));

        EsteAdapter itemsAdapter = new EsteAdapter(this, este);
        ListView listView = (ListView) findViewById(R.id.listview_este);
        listView.setAdapter(itemsAdapter);
    }
}