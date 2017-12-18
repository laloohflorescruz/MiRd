package com.crudcreativo.mird;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        TextView cibao = (TextView) findViewById(R.id.tvCibao);
        cibao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cibaoIntent = new Intent(MainActivity.this, CibaoActivity.class);
                startActivity(cibaoIntent);
            }
        });

    }
}

