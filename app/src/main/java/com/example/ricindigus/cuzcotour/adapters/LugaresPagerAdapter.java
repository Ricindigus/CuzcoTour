package com.example.ricindigus.cuzcotour.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ricindigus.cuzcotour.R;
import com.example.ricindigus.cuzcotour.fragments.lugares.LugaresFragment;

public class LugaresPagerAdapter extends FragmentPagerAdapter {

    Context context;

    public LugaresPagerAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return new LugaresFragment(position);
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return context.getString(R.string.lugares_centros_arqueologicos);
            case 1: return context.getString(R.string.lugares_iglesias_conventos);
            case 2: return context.getString(R.string.lugares_museos);
            case 3: return context.getString(R.string.lugares_casas_coloniales);
            case 4: return context.getString(R.string.lugares_palacios_inca);
            case 5: return context.getString(R.string.lugares_atractivos_naturales);
            default:return null;

        }
    }
}
