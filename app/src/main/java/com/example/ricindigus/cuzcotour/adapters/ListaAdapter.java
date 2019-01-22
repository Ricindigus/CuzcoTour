package com.example.ricindigus.cuzcotour.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ricindigus.cuzcotour.R;
import com.example.ricindigus.cuzcotour.pojos.ItemLista;

import java.util.List;

public class ListaAdapter extends ArrayAdapter<ItemLista> {

    public ListaAdapter(Context context, List<ItemLista> objects) {
        super(context, 0, objects);
    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_festividades,parent,false);
        }

        ImageView imagen = convertView.findViewById(R.id.imagen_festividad);
        TextView titulo = convertView.findViewById(R.id.titulo_festividad);
        TextView fecha = convertView.findViewById(R.id.fecha_festividad);
        TextView descripcion = convertView.findViewById(R.id.descripcion_festividad);

        ItemLista currentItem = getItem(position);

        imagen.setImageResource(currentItem.getImagen());
        titulo.setText(currentItem.getTitulo());

        if (currentItem.getFecha() == null) fecha.setVisibility(View.GONE);
        else fecha.setText(currentItem.getFecha());


        descripcion.setText(currentItem.getDescripcion().substring(0,100)+"...");

        return convertView;
    }
}
