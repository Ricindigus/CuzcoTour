package com.example.ricindigus.cuzcotour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ricindigus.cuzcotour.adapters.ListaAdapter;
import com.example.ricindigus.cuzcotour.pojos.ItemLista;

import java.util.ArrayList;
import java.util.List;

public class ComidasActivity extends AppCompatActivity {
    ListView listView;
    List<ItemLista> comidas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion_simple);
        listView = findViewById(R.id.lista);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.titulo_comidas);
        getSupportActionBar().setSubtitle(R.string.app_name);


        inicializarDatos();
        final ListaAdapter listaAdapter = new ListaAdapter(this,comidas);
        listView.setAdapter(listaAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ComidasActivity.this,DetalleItemActivity.class);
                intent.putExtra("imagen",comidas.get(position).getImagen());
                intent.putExtra("texto",comidas.get(position).getDescripcion());
                startActivity(intent);
            }
        });
    }

    private void inicializarDatos() {
        comidas = new ArrayList<>();
        comidas.add(new ItemLista(R.drawable.chancho_horno,"Chancho al horno o lechón al horno", null,
                "La carne asada de lechón o cerdo se sirve como piqueo. Se escogen trozos de carne de cerdo con hueso, " +
                        "se lavan, sazonan y se ponen a macerar con sal, pimienta, ají molido, vinagre, cerveza o sillao y ají " +
                        "panca molido. Se deja macerar de 24 a 48 horas. Después se hornea a fuego lento hasta verificar que esté a punto. " +
                        "Se sirve con yucas y mote. Este plato lo podemos encontrar en varios restaurantes de Lima."));
        comidas.add(new ItemLista(R.drawable.lawa_chuno,"Chuño cola o Lawa de chuño",null,
                "Delicioso potaje de origen incaico. Es un caldo picante a base de papas, chuño, garbanzos, arroz, carnes diversas. " +
                        "En un litro de de caldo se hierven salchichas serranas, un puñado de arroz, frejoles verdes, y papas peladas cortadas. " +
                        "Cuando todo está cocinado, se agrega harina de chuño disuelta en agua fría. La mezcla se revuelve con un cucharón de palo " +
                        "llamado wisla y se deja cocinar hasta que toma punto. Este plato se come en cualquier época del año."));

        comidas.add(new ItemLista(R.drawable.olluquito_charqui,"Olluquito con charqui",null,
                "Este plato es uno de los platos fundamentales de la cocina peruana. Tiene dos ingredientes que son exclusivamente peruanos:" +
                        " olluco, un tipo de papa que crece en los andes y charqui, carne seca de llama o alpaca, los cuales son productos propios del Perú.\n" +
                        "\n" +
                        "Es un guiso de ollucos y carne seca picada. Actualmente se sirve con arroz. Se lavan los ollucos y se cortan en tiras largas delgadas." +
                        " En una olla con aceite, se fríe el ajo, ají panca molido, charqui cortado finito o carne de res, pimienta, sal y comino. Se revuelve bien " +
                        "y se espera que todo esté bien cocido para agregar el olluco picado. Se echa caldo y se tapa. Cuando está listo se echa un poco de aceite y " +
                        "al servir se le vierte perejil fresco picado."));
        comidas.add(new ItemLista(R.drawable.chiriuchu,"Chiri uchu",null,
                "En la gastronomía cuzqueña existe un plato representativo que es muy conocido llamado Chiri uchu que significa ají frío. Es un delicioso " +
                        "potaje que se sirve frío y que se consume en las fiestas de Corpus Christi, en el mes de junio, se festeja en el Sacsayhuamán.\n" +
                        "\n" +
                        "La comida es fría, se prepara a base de cuy al horno, gallina hervida, salchicha serrana, queso fresco, cancha tostada, rocoto, " +
                        "huevera de trucha, cebollita china, morcilla, cochayuyo o algas, chorizo, caldo de gallina, charqui o chalona y una tortilla a base " +
                        "de harina de maíz. Se pone todo a hervir y se sirve junto en un sólo plato."));
        comidas.add(new ItemLista(R.drawable.pepian_cuy,"Pepián de cuy",null,
                "Es un guiso de choclo y carne de cuy, aderezado con cebolla y ají panca. Luego de pelarlo en agua hervida, se le saca las vísceras " +
                        "al cuy y se le corta en varios trozos, los cuales se polvorean con harina de maíz para freirlo en aceite bien caliente. En otra olla se " +
                        "prepara un aderezo de cebolla, ajo doradito y ají colorado. Se aderezan los cuyes y se les agrega maní al gusto. El plato se sirve con arroz" +
                        " y papas huayro sancochadas."));
        comidas.add(new ItemLista(R.drawable.queso_kapchi,"Queso kapchi",null,
                "Es un plato frío de queso fresco, habas, cebollas, papas que se sazonan con leche y ají. Es el plato favorito de los últimos meses del año.\n" +
                        "Se sancochan habas en una olla. Aparte en una sartén se adereza cebolla, ajo y aceite. Una vez que el aderezo está listo, se le agregan las habas, " +
                        "papas sancochadas, leche, ají colorado o amarillo. Se sirve con arroz."));
        comidas.add(new ItemLista(R.drawable.timpu_puchero,"Timpu o puchero",null,
                "Es un plato típico de la época de carnaval. Es un clado que lleva diversas carnes, verduras, legumbres y más. Se deja hervir un pecho de vaca o cordero," +
                        " tocino. Cuando está en pleno hervor se agrega hojas de col, papas, garbanzos y arroz, ya preparados. En otra olla se hierven camotes, peras y yucas. " +
                        "El caldo se sirve aparte."));
        comidas.add(new ItemLista(R.drawable.chicharron_cusqueno,"Chicharrón a la cusqueña",null,
                "La carne del cerdo se troza y se dora en su propia grasa. Se sirve en el desayuno. Se prepara el cerdo o porcino en trozos con su hueso en una olla. " +
                        "Al hervir, la carne lanza su grasa, se consume el líquido y se va dorando poco a poco. Se corta, se sala y se sirve acompañado de cancha de maíz, papa o yuca." +
                        " También lo sirven como merienda en fiestas patronales o religiosas para departir como el Qoyllur Riti por ejemplo. Actualmente lo sirven con pan."));

    }
}
