package com.example.ricindigus.cuzcotour;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ricindigus.cuzcotour.adapters.InformacionPagerAdapter;

public class InformacionActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion_viewpager);

        tabLayout = findViewById(R.id.slides);
        viewPager = findViewById(R.id.paginas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.titulo_informacion);
        getSupportActionBar().setSubtitle(R.string.app_name);


        InformacionPagerAdapter informacionPagerAdapter = new InformacionPagerAdapter(getSupportFragmentManager(),this);
        viewPager.setAdapter(informacionPagerAdapter);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setupWithViewPager(viewPager);
    }
}
