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
        este.add(new Este("Cueva de las Maravillas", R.drawable.cuevas_maravillas));
        este.add(new Este("Isla Saona", R.drawable.isla_saona));
        este.add(new Este("Isla Catalina", R.drawable.isla_catalina));
        este.add(new Este("Altos de Chavon", R.drawable.altos_de_chavon));
        este.add(new Este("Oyo Azul", R.drawable.hoyo_azul));
        este.add(new Este("Playa Bayahibe", R.drawable.bayahibe));
        este.add(new Este("Basilica de La Altagracia", R.drawable.basilica_altgracia));
        este.add(new Este("Playa Juanillo", R.drawable.playa_juanillo));

        EsteAdapter itemsAdapter = new EsteAdapter(this, este);
        ListView listView = (ListView) findViewById(R.id.listview_este);
        listView.setAdapter(itemsAdapter);
    }
}