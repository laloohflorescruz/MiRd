package com.crudcreativo.mird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class EsteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_este);

        ArrayList<String> este = new ArrayList<String>();

        este.add("Playa Boca Chica");
        este.add("Cueva de las Maravillas");
        este.add("Casa de Campo");
        este.add("Isla Saona");
        este.add("Isla Catalina");
        este.add("Altos de Chavon");
        este.add("Oyo Azul");
        este.add("Playa Bayahibe");
        este.add("Basilica de La Altagracia");
        este.add("Cuevas Fun-Fun");
        este.add("Playa Juanillo");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for (int index = 0; index < este.size(); index++)
        {
            TextView esteView = new TextView(this);
            esteView.setText(este.get(index));
            rootView.addView(esteView);
        }
    }
}
