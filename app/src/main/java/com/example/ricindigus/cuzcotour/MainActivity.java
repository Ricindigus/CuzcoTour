package com.example.ricindigus.cuzcotour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout informacion;
    LinearLayout lugares;
    LinearLayout festividades;
    LinearLayout comidas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        informacion = findViewById(R.id.opcion_informacion);
        lugares = findViewById(R.id.opcion_lugares);
        festividades = findViewById(R.id.opcion_festividades);
        comidas = findViewById(R.id.opcion_comidas);

        informacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,InformacionActivity.class);
                startActivity(intent);
            }
        });

        lugares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LugaresActivity.class);
                startActivity(intent);
            }
        });

        festividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FestividadesActivity.class);
                startActivity(intent);
            }
        });
        comidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ComidasActivity.class);
                startActivity(intent);
            }
        });
    }
}
