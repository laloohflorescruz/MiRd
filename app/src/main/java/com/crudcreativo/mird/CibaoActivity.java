package com.crudcreativo.mird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CibaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cibao);

        ArrayList<Cibao> cibao = new ArrayList<Cibao>();
        cibao.add(new Cibao("Reloj de Montecristi"));
        cibao.add(new Cibao("Iglesia de San Fernando"));
        cibao.add(new Cibao("Casa Museo Tiburcio"));
        cibao.add(new Cibao("Plaza de la Cultura Cándido Bidó"));
        cibao.add(new Cibao("Pueblo de los Pescadores"));
        cibao.add(new Cibao("Centro Cultural León"));
        cibao.add(new Cibao("Monumento a los Héroes de la Restauración"));
        cibao.add(new Cibao("Catedral de Santiago Apóstol"));
        cibao.add(new Cibao("Museo de Arte Folklórico Tomás Morel"));
        cibao.add(new Cibao("Santo Cerro"));
        cibao.add(new Cibao("Museo del Ambar"));

        CibaoAdapter itemsAdapter = new CibaoAdapter(this, cibao);
        ListView listView = (ListView) findViewById(R.id.listview_cibao);
        listView.setAdapter(itemsAdapter);
    }
}
