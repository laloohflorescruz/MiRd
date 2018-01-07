package com.crudcreativo.mird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SantoDomingoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santo_domingo);

        ArrayList<SantoDomingo> santodomingo = new ArrayList<SantoDomingo>();
        santodomingo.add(new SantoDomingo("Faro a Colon"));
        santodomingo.add(new SantoDomingo("Zoologico Dominicano"));
        santodomingo.add(new SantoDomingo("Alcazar de Colon"));
        santodomingo.add(new SantoDomingo("Puerta del Conde"));
        santodomingo.add(new SantoDomingo("Puerta de la Misericordia"));
        santodomingo.add(new SantoDomingo("Altar de la Patria"));
        santodomingo.add(new SantoDomingo("Panteon Nacional"));
        santodomingo.add(new SantoDomingo("Fortaleza Ozama"));
        santodomingo.add(new SantoDomingo("Parque Colon"));
        santodomingo.add(new SantoDomingo("Acuario Nacional"));
        santodomingo.add(new SantoDomingo("Jardin Botanico"));

        SantoDomingoAdapter itemsAdapter = new SantoDomingoAdapter(this, santodomingo);
        ListView listView = (ListView) findViewById(R.id.listview_santoDomingo);
        listView.setAdapter(itemsAdapter);
    }
}
