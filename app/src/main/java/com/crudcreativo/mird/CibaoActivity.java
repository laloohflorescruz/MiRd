package com.crudcreativo.mird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CibaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cibao);

        ArrayList<String> cibao = new ArrayList<String>();

        cibao.add("Reloj de Montecristi");
        cibao.add("Iglesia de San Fernando");
        cibao.add("Casa Museo Tiburcio");
        cibao.add("Plaza de la Cultura Cándido Bidó");
        cibao.add("Pueblo de los Pescadores");
        cibao.add("Centro Cultural León");
        cibao.add("Monumento a los Héroes de la Restauración");
        cibao.add("Catedral de Santiago Apóstol");
        cibao.add("Museo de Arte Folklórico Tomás Morel");
        cibao.add("Santo Cerro");
        cibao.add("Museo del Ambar");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for (int index = 0; index < cibao.size(); index++)
        {
            TextView cibaoView = new TextView(this);
            cibaoView.setText(cibao.get(index));
            rootView.addView(cibaoView);
        }
    }
}
