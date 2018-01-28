package com.crudcreativo.mird;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);

        TextView sd = (TextView)findViewById(R.id.tvSD);
        sd.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent santoDomingoIntent = new Intent(MainActivity.this, SantoDomingoActivity.class);
                startActivity(santoDomingoIntent);
            }
        });


        TextView cibao = (TextView)findViewById(R.id.tvCibao);
        cibao.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent cibaoIntent = new Intent(MainActivity.this, CibaoActivity.class);
                startActivity(cibaoIntent);
            }
        });


        TextView este = (TextView)findViewById(R.id.tvEste);
        este.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent esteIntent = new Intent(MainActivity.this, EsteActivity.class);
                startActivity(esteIntent);
            }
        });


        TextView sur = (TextView)findViewById(R.id.tvSur);
        sur.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent surIntent = new Intent(MainActivity.this, SurActivity.class);
                startActivity(surIntent);
            }
        });


        TextView mapa = (TextView)findViewById(R.id.tvMapa);
        mapa.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent mapaIntent = new Intent(MainActivity.this, MapaActivity.class);
                startActivity(mapaIntent);
            }
        });
    }
}

