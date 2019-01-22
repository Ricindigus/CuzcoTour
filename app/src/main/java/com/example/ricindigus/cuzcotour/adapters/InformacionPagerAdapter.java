package com.example.ricindigus.cuzcotour.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ricindigus.cuzcotour.R;
import com.example.ricindigus.cuzcotour.fragments.informacion.InformacionFragment;

public class InformacionPagerAdapter extends FragmentPagerAdapter {

    Context mContext;

    public InformacionPagerAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        return new InformacionFragment(position);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return mContext.getString(R.string.page_uno_informacion);
            case 1: return mContext.getString(R.string.page_dos_informacion);
            case 2: return mContext.getString(R.string.page_tres_informacion);
            case 3: return mContext.getString(R.string.page_cuatro_informacion);
            default: return null;
        }
    }
}
