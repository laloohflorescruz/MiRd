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
        santodomingo.add(new SantoDomingo("Faro a Colon", R.drawable.faro_colon));
        santodomingo.add(new SantoDomingo("Zoologico Dominicano", R.drawable.zoodom));
        santodomingo.add(new SantoDomingo("Alcazar de Colon", R.drawable.alcazar));
        santodomingo.add(new SantoDomingo("Puerta del Conde", R.drawable.puerta_conde));
        santodomingo.add(new SantoDomingo("Puerta de la Misericordia", R.drawable.puerta_misericordia));
        santodomingo.add(new SantoDomingo("Altar de la Patria", R.drawable.altar_patria));
        santodomingo.add(new SantoDomingo("Panteon Nacional",R.drawable.panteon_nacional));
        santodomingo.add(new SantoDomingo("Fortaleza Ozama", R.drawable.fortaleza_ozama));
        santodomingo.add(new SantoDomingo("Parque Colon", R.drawable.parque_colon));
        santodomingo.add(new SantoDomingo("Acuario Nacional", R.drawable.acuario_dominicano));
        santodomingo.add(new SantoDomingo("Jardin Botanico", R.drawable.botanico));

        SantoDomingoAdapter itemsAdapter = new SantoDomingoAdapter(this, santodomingo);
        ListView listView = (ListView) findViewById(R.id.listview_santoDomingo);
        listView.setAdapter(itemsAdapter);
    }
}
