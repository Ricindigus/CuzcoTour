package com.example.ricindigus.cuzcotour.fragments.informacion;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ricindigus.cuzcotour.R;

public class InformacionFragment extends Fragment {

    int tipoFragment;
    TextView txtInformacion;

    public InformacionFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public InformacionFragment(int tipoFragment) {
        this.tipoFragment = tipoFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_informacion, container, false);
        txtInformacion = rootView.findViewById(R.id.informacion);
        txtInformacion.setMovementMethod(new ScrollingMovementMethod());
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        switch (tipoFragment){
            case 0: txtInformacion.setText(getText(R.string.informacion_general));break;
            case 1: txtInformacion.setText(getText(R.string.informacion_clima));break;

        }
    }
}
