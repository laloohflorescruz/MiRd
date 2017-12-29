package com.crudcreativo.mird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SantoDomingoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santo_domingo);

        ArrayList<String> santodomingo = new ArrayList<String>();

        santodomingo.add("Faro a Colon");
        santodomingo.add("Zoologico Dominicano");
        santodomingo.add("Alcazar de Colon");
        santodomingo.add("Puerta del Conde");
        santodomingo.add("Puerta de la Misericordia");
        santodomingo.add("Altar de la Patria");
        santodomingo.add("Panteon Nacional");
        santodomingo.add("Fortaleza Ozama");
        santodomingo.add("Parque Colon");
        santodomingo.add("Acuario Nacional");
        santodomingo.add("Jardin Botanico");

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        int index =0;
        while(index<santodomingo.size())
        {
            TextView santoDomingoView = new TextView(this);
            santoDomingoView.setText(santodomingo.get(index));
            rootView.addView(santoDomingoView);

            index++;
        }
    }
}
