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
        cibao.add(new Cibao("Reloj de Montecristi", R.drawable.reloj_de_montecristi));
        cibao.add(new Cibao("Iglesia de San Fernando", R.drawable.iglesia_fernando));
        cibao.add(new Cibao("Casa Museo Tiburcio", R.drawable.casa_museo_tiburcio));
        cibao.add(new Cibao("Plaza de la Cultura Cándido Bidó", R.drawable.plaza_cultura_candido_bido));
        cibao.add(new Cibao("Pueblo de los Pescadores", R.drawable.pueblo_de_los_pescadores));
        cibao.add(new Cibao("Centro Cultural León", R.drawable.centro_cultural_leon));
        cibao.add(new Cibao("Monumento a los Héroes de la Restauración", R.drawable.monumento_restauracion));
        cibao.add(new Cibao("Catedral de Santiago Apóstol", R.drawable.catedral_santiago_apostol));
         cibao.add(new Cibao("Santo Cerro", R.drawable.santo_cerro));
        cibao.add(new Cibao("Museo del Ambar", R.drawable.museo_del_ambar));

        CibaoAdapter itemsAdapter = new CibaoAdapter(this, cibao);
        ListView listView = (ListView) findViewById(R.id.listview_cibao);
        listView.setAdapter(itemsAdapter);
    }
}
