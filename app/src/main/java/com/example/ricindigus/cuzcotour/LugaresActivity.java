package com.example.ricindigus.cuzcotour;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ricindigus.cuzcotour.adapters.LugaresPagerAdapter;

public class LugaresActivity extends AppCompatActivity {

    TabLayout categorias;
    ViewPager paginas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion_viewpager);

        categorias = findViewById(R.id.slides);
        paginas = findViewById(R.id.paginas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.titulo_lugares);
        getSupportActionBar().setSubtitle(R.string.app_name);


        LugaresPagerAdapter lugaresPagerAdapter = new LugaresPagerAdapter(getSupportFragmentManager(),this);
        paginas.setAdapter(lugaresPagerAdapter);
        categorias.setTabMode(TabLayout.MODE_SCROLLABLE);
        categorias.setTabGravity(TabLayout.GRAVITY_FILL);
        categorias.setupWithViewPager(paginas);
    }
}
