package com.example.ricindigus.cuzcotour.fragments.lugares;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ricindigus.cuzcotour.DetalleItemActivity;
import com.example.ricindigus.cuzcotour.R;
import com.example.ricindigus.cuzcotour.adapters.ListaAdapter;
import com.example.ricindigus.cuzcotour.pojos.ItemLista;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LugaresFragment extends Fragment {

    int tipoFragment;
    ListView listView;
    List<ItemLista> lugares;

    public LugaresFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public LugaresFragment(int tipoFragment) {
        this.tipoFragment = tipoFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_lugares, container, false);
        listView = rootView.findViewById(R.id.lista_lugares);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        inicializarDatos();
        ListaAdapter listaAdapter = new ListaAdapter(getActivity(), lugares);
        listView.setAdapter(listaAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DetalleItemActivity.class);
                intent.putExtra("imagen", lugares.get(position).getImagen());
                intent.putExtra("texto", lugares.get(position).getDescripcion());
                startActivity(intent);
            }
        });
    }

    private void inicializarDatos() {
        lugares = new ArrayList<>();
        switch (tipoFragment) {
            case 0:
                lugares.add(new ItemLista(R.drawable.qorikancha, "Qorikancha", null,
                        "Tambien llamado \"Koricancha\" o \"Coricancha\", es el más esplendido monumento arquitectónico de todo el Imperio, está hecho con piezas líticas grandes y medianas ensambladas a la perfección. Actualmente sobre la base de este recinto se encuentra el templo y convento de Santo Domingo, en la plaza Santo Domingo."));
                lugares.add(new ItemLista(R.drawable.sacsayhuaman, "Sacsayhuamán", null,
                        "Sacsayhuamán es uno de los más imponentes complejos arquitectónicos construidos en tiempos de los Incas, está emplazado hacia el norte de la plaza principal de la ciudad de Cusco. Sacsayhuaman se construyó entre los siglos XIV y XV. La obra duro más de cinco décadas, requirió el trabajo de 20 000 hombres que se juntaron en forma de tributo (mita)."));
                lugares.add(new ItemLista(R.drawable.qenqo, "Q’enqo", null,
                        "Q’enqo está formado por dos grupos arqueológicos cercanos uno al otro, que tienen como base enormes afloramientos de roca caliza. “Q’enqo” significa laberinto torcido, se encuentra muy cerca al complejo arqueologico de \"Sacsayhuaman\""));
                lugares.add(new ItemLista(R.drawable.tambomachay, "Tambomachay", null,
                        "Tanpumach’ay o Tambomachay, se halla a las faldas de Cebollahuayq’o; cuyos cerros que la encajonan, son visibles desde la ciudad. Este complejo arqueológico habría cumplido una importante función religiosa vinculada al agua y a la regeneración de la tierra."));
                lugares.add(new ItemLista(R.drawable.pukapukara, "Pukapukara", null,
                        "Pukapukara es un complejo arqueológico que está emplazado sobre un enorme roquedal con una superficie de 5600 m2. Su nombre significa Fortaleza Roja, el nombre le fue puesto en el presente siglo."));
                break;
            case 1:
                lugares.add(new ItemLista(R.drawable.basilica_cusco, "La Basílica Catedral Del Cusco", null,
                        "Es el monumento más importante, imponente y suntuoso de la arquitectura colonial, por ser depositario de múltiples manifestaciones artísticas. Construido en la que fue el \"Suntur Wasi\" y \"Kiswar Kancha\" de los Incas, fue edificado con las piedras de las moles de las murallas de Sacsayhuaman. "));
                lugares.add(new ItemLista(R.drawable.compania_jesus, "Iglesia De La Compañía De Jesús", null,
                        "Es uno de los monumentos más sobresalientes del barroco andino y está erigido sobre el \"Amaru Kancha\", el palacio de la panaca del Inca \"Huayna Cápac\". Su ubicación y su opulencia, que opacaba la primacía de la Catedral, dio lugar a graves disputas entre los jesuitas y el clero cusqueño. La primera fundación de la iglesia se efectuó el 17 de Julio de 1571, por orden del Virrey Francisco de Toledo, a iniciativa del padre provincial Jerónimo Ruiz de Portillo."));
                lugares.add(new ItemLista(R.drawable.la_merced, "Iglesia De La Merced", null,
                        "La iglesia y el convento de La Merced, cuya construcción original se remonta a mediados del siglo XVI, es una de las más antiguas de la ciudad del Cusco y fue construida en la antigua \"Cusipata\" en el centro de la ciudad del Cusco. El convento antiguamente tenía cuatro claustros, actualmente quedan dos claustros conventuales y uno de ellos se ha convertido en el actual "));
                lugares.add(new ItemLista(R.drawable.san_fransisco_asis, "Iglesia De San Francisco De Asís", null,
                        "La estructura del convento y la \"iglesia de San Francisco de Asis\" se yerguen junto al colegio nacional de ciencias y fue puesta al servicio de su orden en 1652. Aquí se halla, posiblemente el más grande lienzo del continente. La iglesia de \"San Francisco\" fue fundada por los Padres Franciscanos en el año 1645, cuenta con dos fachadas y una única torre. Esta iglesia es de cantería de estilo español antiguo y fue finalizada en 1650."));
                lugares.add(new ItemLista(R.drawable.santo_domingo, "Iglesia Y Convento De Santo Domingo", null,
                        "El convento y la iglesia de Santo Domingo fuereon Construidos sobre una de los lugares más sagrados en la época precolombina, fue llamado en la época de los Incas\" Inti Cancha\", era el templo principal de los quechuas en el Valle del Cusco, estuvo en un principio dedicado a las deidades ligadas a los ritos agrarios. En su interior se pueden apreciar los restos del Qoricancha."));
                lugares.add(new ItemLista(R.drawable.santa_catalina, "Iglesia Y Convento De Santa Catalina", null,
                        "Esta iglesia se levanta sobre lo que fue la Casa de las Escogidas o Vírgenes del Sol, llamada también Acllawasi. En la época inca el \"Acllahuasi\" ocupaba toda la manzana, limitada por la Plaza de Armas, Calle Loreto, Calle K’aspi k’ijllu hoy Loreto y la Calle Maruri."));
                lugares.add(new ItemLista(R.drawable.san_blas, "Iglesia De San Blas", null,
                        "Edificado sobre el barrio inca de “Tococachi” lo que hoy es el \"barrio de San Blas\", exactamente sobre un lugar donde se rendía culto al “Illapa”(Rayo en quechua). Esta iglesia es conocida por su pulpito, que según muchos especialistas es la más sorprendente obra de carpintería de estilo churrigueresco español existente."));
                lugares.add(new ItemLista(R.drawable.belen, "Iglesia De Belén", null,
                        "Construida en uno de los barrios incaicos llamado Ch'akillchaKa, hacia el occidente de la ciudad del Cusco. Dicha iglesia al igual que muchas sufrió un grave deterioro en el terremoto de 1650 y fue reconstruida posteriormente. Belén es el convento más antiguo de la ciudad del Cusco, dedicado al recogimiento de las mestizas, se fundó el 30 de abril de 1550."));
                lugares.add(new ItemLista(R.drawable.san_pedro, "Iglesia De San Pedro", null,
                        "En sus inicios fue un hospital para atender a los indios o naturales. Se construyó el año 1556 y se ubica a seis cuadras al occidente de la Plaza de Armas del Cusco. Esta iglesia como la mayoria en Cusco, tiene importantes obras pictóricas como por ejemplo el púlpito, que fue tallado por Juan Tomas Tuyru Túpac."));
                lugares.add(new ItemLista(R.drawable.san_cristobal, "Iglesia De San Cristóbal", null,
                        "La iglesia de San Cristobal está edificada sobre lo que fue el \"palacio de Manco Cápac\". Su construcción se inició el año 1673 y fue una parroquia destinada a los indios o naturales del Cusco. Es un templo de una sola torre, cuya arquitectura es casi igual a la Iglesia de \"Santa Clara\", la torre de la iglesia es de piedra pero la iglesia misma esta hecha de adobe."));
                break;
        }
    }
}
