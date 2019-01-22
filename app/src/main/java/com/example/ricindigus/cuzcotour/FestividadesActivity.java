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

public class FestividadesActivity extends AppCompatActivity {
    ListView listView;
    List<ItemLista> festividades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion_simple);
        listView = findViewById(R.id.lista);
        inicializarDatos();
        final ListaAdapter listaAdapter = new ListaAdapter(this,festividades);
        listView.setAdapter(listaAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.titulo_festividades);
        getSupportActionBar().setSubtitle(R.string.app_name);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FestividadesActivity.this,DetalleItemActivity.class);
                intent.putExtra("imagen",festividades.get(position).getImagen());
                intent.putExtra("texto",festividades.get(position).getDescripcion());
                startActivity(intent);
            }
        });


    }

    private void inicializarDatos() {
        festividades = new ArrayList<ItemLista>();
        festividades.add(new ItemLista(R.drawable.bajada_reyes,"Bajada de Reyes Magos","06 de Enero",
                "La tradicional Navidad Cusqueña termina con la Fiesta de la Bajada de Reyes, evento " +
                        "costumbrista también conocida como descenso de los tres hombres sabios, es una clara " +
                        "mezcla de las religiosidades cristianas y nativas, como parte del largo proceso de cambios " +
                        "y asimilación en la sociedad andina, para la cual todas las fiestas patronales se ubican dentro " +
                        "del ciclo agrícola. Por ello, aquellas de origen prehispánico han sido adaptadas a las celebraciones cristianas, " +
                        "pues el poblador andino es profundamente devoto de Cristo, sin que esto le impida encomendarse a los apus y realizar " +
                        "ofrendas a la pachamama.\n" + "\n" +
                        "En este contexto, enero es el mes de las lluvias, elemento importantísimo en el ciclo agrícola, sin el cual " +
                        "las tierras sembradas no darían fruto. Por ello, desde tiempos inmemoriales, el pueblo agradece con alegría y " +
                        "ambiente festivo que las gotas rieguen los campos. Enero también es el mes en el cual el Niño Jesús desciende " +
                        "de las alturas. Mes en que se ofrecen exquisitos potajes para que la tierra sea generosa al dar frutos, de la " +
                        "misma manera como los Tres Reyes Magos traen los presentes al Niño Jesús."));
        festividades.add(new ItemLista(R.drawable.carnaval_cusque_o,"Carnaval Cusqueño","03 de Marzo",
                "El carnaval cusqueño se realiza en Febrero o Marzo, la fecha es movible.\n" + "\n" +
                        "Festividad que une a la población cusqueña a través de la alegoría y el juego mesurado. Las “yunzas o cortamontes “, " +
                        "son el principal atractivo de esta fiesta que consiste en la profusión del juego con agua, talco y mixtura.\n" + "\n" +
                        "La fiesta principal del Carnaval Cusqueño se realiza en la Plaza de Armas del Cusco, con la presentación de instituciones " +
                        "públicas y privadas, que ofrecen lo mejor de sus danzas, comparsas y pandillas, muchas de ellas ganadoras de los diversos " +
                        "Festivales carnavalescos del valle Sur y Valle Sagrado de los Inkas.\n" + "\n" +
                        "De igual forma, se desarrolla un festival gastronómico carnavalesco, en donde los diversos potajes y bebidas predominan " +
                        "como como el \"puchero\" o \"t´impu\" para el deleite y satisfacción del público asistente."));
        festividades.add(new ItemLista(R.drawable.semana_santa_en_cusco,"Semana Santa en Cusco","18 y 19 de Abril" ,"La Semana Santa en Cusco se celebra entre la segunda quincena de Marzo a la segunda semana de Abril, la fecha es movible.\n" +
                "\n" +
                "Domingo de Ramos 14 de Abril / Viernes Santo 19 de Abril / Domingo de Resurreccion 21 de Abril de 2019\n" +
                "\n" +
                "La Semana Santa es uno de los acontecimientos más importantes del mundo cristiano, cuando se conmemora la muerte y la resurrección de Jesucristo en cada rincón del orbe católico, en Cusco esta festividad adquiere diversas expresiones según la tradición y las costumbres locales.\n" +
                "\n" +
                "La fiesta se inicia con el “Domingo de Ramos”, donde los fieles asisten a las diferentes parroquias de la ciudad portando hojas de palma y cruces tejidas de la misma planta, las que se hacen bendecir en las celebraciones Eucarísticas de los distintos templos de la ciudad; para después llevarlas a las casas y colocarlas tras las puertas, como un símbolo de protección para el hogar.\n" +
                "\n" +
                "La Semana Santa en Cusco tiene como día central Lunes Santo (dia siguiente del domingo de ramos) fecha que sale en procesión el Patrón Jurado del Cusco, el Señor de los Temblores.\n" +
                "\n" +
                "En el Viernes Santo, al igual que en Ayacucho, acontece el encuentro de las andas del Cristo en el Santo Sepulcro y de la Virgen Dolorosa.\n" +
                "\n" +
                "Ese día, a diferencia a lo que sucede en otros lugares, no es de abstinencia en el Cusco. La costumbre es degustar doce platos típicos distintos que incluyen desde variadas sopas y potajes ya sea a base de pescado seco, trigo y olluco, hasta los deliciosos postres como los dulces de manzana, maíz o choclo.\n" +
                "\n" +
                "La Semana Santa llega a su fin el Domingo de Resurrección. Luego de la procesión y de la celebración de la misa, por las principales calles se percibe el aroma exquisito de los manjares que deleitan propios y extraños, como el sabroso caldo de gallina, las empanadas, el dulce de maíz blanco, los tamales y las tortas. Así, en forma pagana, se cierra en la milenaria ciudad imperial del Cusco la Semana Santa andina."));
        festividades.add(new ItemLista(R.drawable.fiesta_de_la_cruz_cusco,"Fiesta de la Cruz ó Cruz Velacuy", "03 de Mayo",
                "Al llegar los españoles a nuestras tierras, una de los primeros elementos católicas utilizados con mucha eficacia fue la Cruz, en el caso del Tawantinsuyo, las cruces se ubicaron en los diversos lugares y sitios sagrados, que eran morada o adoratorio de los dioses andinos, al ser un símbolo del bien contra el mal, está presente en todas partes y en todo momento, mereciendo permanentemente la invocación espiritual y la celebración externa en diferentes ocasiones.\n" +
                        "\n" +
                        "Esta fiesta se origina en las primeras décadas del siglo XVIII. Cuando en ese entonces era una festividad privada familiar relativamente humilde y/o modesto sin la maginifisencia que la tiene hoy en día. La cruz es un símbolo del cristianismo de igual manera para los católicos es la representación de la pasión de Jesucristo, luego de producirse la conquista española, la cruz fue uno de los elementos de lucha y riña ideológica para evangelizar a los americanos y también para facilitar a su sumisión, así su adoración y su uso fueron obligatorios en el nuevo mundo, los “extirpadores de idolatrías ” (sacerdotes católicos ) al destruir sus santuarios incas (ídolos incas) tuvieron mucho cuidado en colocar cruces en su lugar.\n" +
                        "\n" +
                        "La celebración de la cruz normalmente tiene un mayordomo o “carguyoq” la persona quien acepto voluntariamente organizar y costear la mayor parte de los gastos para la celebración, quien casi siempre es una persona con recursos y propietario de una casa donde se levantara un altar para la cruz.\n" +
                        "\n" +
                        "El inicio de la festividad es el día 2 de mayo con el traslado o bajada de la cruces desde las cumbres de los cerros o santuarios donde se encuentran."));
        festividades.add(new ItemLista(R.drawable.fiesta_de_coyllority,"Señor de Coyllority", "16 de Junio",
                "La peregrinación al santuario del Sr. de Ccoylloritti se realiza todos los años en el mes de mayo o junio la fecha no es exacta debido al calendario andino, pero esta entre estos dos meses..\n" +
                        "\n" +
                        "Los pobladores del distrito de Ocongate (Quispicanchis), en el departamento de Cusco, realizan un rito cuyo símbolo externo es la imagen de Cristo, pero su objeto de fondo es la integración del hombre con la naturaleza, las personas de este lugar son devotos del Taytacha Qoyllur Rit'i (El señor de la Nieve Brillante). Esta es una antigua costumbre religiosa sólo practicada por los habitantes de los Andes. Cada año, unos días antes de la celebración del Corpus Christi, cada pueblo pequeño o clan envía una delegación de coloridos bailarines y \"pabluchas\" a la Capilla del Señor de Qoyllur ritty.\n" +
                        "\n" +
                        "El ritual, asociado con la fertilidad de la tierra y con la adoración a los Apus (cerros, dioses tutelares), forma parte de una de las fiestas de naciones indígenas más grande de América. La ceremonia principal se realiza al pie del nevado Ausangate, el ritual consiste en una peregrinación de pastores, comerciantes y curiosos que se reúnen en el santuario de Sinakara en el pueblo de Mawayany, a 4600 metros sobre el nivel del mar."));
        festividades.add(new ItemLista(R.drawable.corpus_christi_cusco,"Corpus Christi Cusqueño", "20 de Junio",
                "La festividad del Corpus Christi se realiza en Junio, la fecha es movible.\n" +
                        "\n" +
                        "El “Corpus Christi Cusqueño” es la fiesta religiosa más importante del Cusco aunque esta fecha siempre cae en Jueves, la fiesta comienza un día antes con las tradicionales “entradas”.\n" +
                        "\n" +
                        "El Miércoles (día anterior al Corpus Christi) se da inicio con la entrada de los santos a la catedral de la ciudad, acompañados de mayordomos, fieles, bandas de músicos y danzas.\n" +
                        "\n" +
                        "En el día central se realiza la fastuosa procesión de las quince imágenes de santos y vírgenes provenientes de igual numero de parroquias del Cusco, encabeza la procesión la carroza de plata que porta la custodia.\n" +
                        "\n" +
                        "Después de siete días (la octava), los santos vuelven a salir en procesión antes de regresar a sus lugares de procedencia, dónde permanecerán por el resto del año."));
        festividades.add(new ItemLista(R.drawable.fiestas_del_cusco,"Fiestas del Cusco", "Todo Junio 2019",
                "Junio mes jubilar del Cusco\n" +
                        "\n" +
                        "El 8 de enero de 1944 se acuerda celebrar el 24 de junio de cada año, el Día del Cusco y la reinserción para la cultura universal de una de las mas grandes fiestas del Imperio Inka: El Inti Raymi. La primera celebración del Día del Cusco, instituida en rememoración a su glorioso pasado, tuvo la asistencia del Presidente de la República de ese entonces, el Dr. Manuel Prado.\n" +
                        "\n" +
                        "Desde entonces los ciudadanos cusqueños celebran el mes jubilar del cusco con una serie de eventos protocolares, artísticos y culturales, los mismos que son la atracción de miles de turistas nacionales y extranjeros."));
        festividades.add(new ItemLista(R.drawable.inti_raymi_cusco,"Inti Raymi: La Fiesta del Sol", "24 de Junio",
                "El Inti Raymi es una fiesta que celebra al dios Sol de los incas, en la actualidad se recrea el 24 de junio de cada año como la festividad más solemne y grandiosa del desaparecido Imperio incaico.\n" +
                        "\n" +
                        "El Inti Raymi es una fiesta celebrada desde el tiempo de los incas durante el solsticio de invierno para adorar al dios Sol, implica coloridos trajes, banquetes de lujo, música festiva, y recreaciones históricas.\n" +
                        "\n" +
                        "El escenario del Inti Raymi es la fortaleza de Sacsayhuamán, ubicada en la zona norte de la ciudad del Cusco, según el Inca Gracilazo de la Vega, Sacsayhuamán es \"la obra mayor y más soberbia que los incas mandaron construir para mostrar su poder y majestad\"."));
        festividades.add(new ItemLista(R.drawable.virgen_del_carmen_paucartambo,"Virgen del Carmen-Paucartambo", "15 de Julio",
                "Entre el 15 y 18 de Julio de todos los años, miles de devotos y visitantes se congregan para celebrar la Festividad de la Virgen del Carmen esta festividad se realiza cada año en el pueblo colonial de Paucartambo a 110 Km. de la ciudad del Cusco, es una típica y hermosa ciudad de adobe y teja.\n" +
                        "\n" +
                        "La festividad de la Virgen del Carmen en Paucartambo Cusco, es una celebración que convoca a muchos feligreses y visitantes de todas partes del mundo encabezando por el pueblo y sus 12 grupos de danzarines que irradian fe, encanto, color y jubilo. Danzas que se brindan a la Virgencita sacrificio de los fieles que realizan con cariño y devoción a la “Mamacha Carmen” a cambio de su bendición y su protección."));
        festividades.add(new ItemLista(R.drawable.pachamama_cusco,"Ofrenda a la Pachamama", "01 de Agosto",
                "Las ceremonias de Ofrenda a la Pachamama se realizan durante el mes de agosto siendo el primer dia del mes que da inicio a esta importante ceremonia de creencia andina\n" +
                        "\n" +
                        "Las ceremonias de ofrendas, comúnmente conocidas por la población andina como pagos a la Tierra o Pachamama, son rituales de origen ancestral que son parte de un sistema de reciprocidad entre el mundo material y el mundo espiritual.\n" +
                        "\n" +
                        "Es un ritual cuya finalidad es devolver a la Madre Tierra lo que te ha dado y lo que podemos aspirar a nuestros deseos más profundos acerca de la vida, lo que queremos lograr en nuestra vida y lo que queremos para nuestros seres queridos, esta ceremonia se realiza el primer día del mes de agosto y durante todo el mes.\n" +
                        "\n" +
                        "Las ceremonias a la Pachamama son de básicamente de dos tipos, en los hogares se realizan ofrendas particulares y en las cumbres se realizan ofrendas comunitarias donde los sacerdotes andino realizan las ceremonias ancestrales, para que la Pachamama, sacie su hambre y les otorgue bendiciones."));
        festividades.add(new ItemLista(R.drawable.fiesta_virgen_natividad,"Fiesta de la Virgen Natividad", "08 de Setiembre",
                "La Virgen Natividad o Nuestra Señora de la Almudena, es una de las representaciones más icónicas de Santa María Virgen y su devoción es ampliamente difundida en todo el Perú y sobre todo Cusco, los días clave de las fiestas son: 7, 8 y 9 de setiembre; sin embargo la celebridad inicia desde el 29 de agosto, con la entrada tradicional denominada: “t’ika apakuy” (entrada de flores), cuyo recorrido inicia en la plaza San Francisco con dirección al templo de Almudena.\n" +
                        "\n" +
                        "El día 29 se realiza la habitual procesión de la Virgen, en horas de la madrugada (3 a.m.), dura aproximadamente cuatro horas, delegaciones eclesiásticas, civiles y autoridades acompañan a la Virgen entre cánticos y oraciones; posteriormente los días siguientes, la Virgen es venerada mediante eucaristías y misas."));
        festividades.add(new ItemLista(R.drawable.senio_de_huanca,"Señor de Huanca", "14 de Seteimbre",
                "La festividad es celebrada cada 14 de septiembre, caracterizada por una peregrinación multitudinaria de devotos del Cusco, Perú e incluso de diferentes lugares como Bolivia, Paraguay, Argentina y Chile, se dirigen al Santuario de Huanca para recibir bendiciones.\n" +
                        "\n" +
                        "Amanece en el santuario y la luz encuentra a cientos de peregrinos arrodillados al calor de unas velas, siempre abrazados a una imagen, a una oración, a su fe. Allí se encuentra la piedra pintada con el motivo de tanta veneración: un Cristo agobiado por los azotes, el Señor de Huanca.\n" +
                        "\n" +
                        "PEREGRINACIÓN AL SANTUARIO\n" +
                        "El santuario del Señor de Huanca está ubicado a 48 Km. de la ciudad del Cusco a 3,100 m.s.n.m. en el distrito de San Salvador, provincia de Calca en el departamento de Cusco.\n" +
                        "\n" +
                        "Para llegar hasta este sagrado lugar algunos lo hacen en auto, muchos a pie. Los más devotos llegan caminando desde la Ciudad Imperial, lo que les toma entre cuatro y seis horas. Por eso, y por la cantidad de fieles que tiene en el Perú, Argentina, Paraguay, Bolivia y Chile, la peregrinación al Señor de Huanca es una de las más significativas del país y, también, una de las más esperadas.\n" +
                        "\n" +
                        "Desde Cusco, toma de 4 a 6 horas de caminata para llegar a “El Señor de Huanca” y 45 min a 1 hora en carro."));
        festividades.add(new ItemLista(R.drawable.cancion_criolla_y_halloween,"La canción Criolla y Halloween", "31 de Octubre",
                "Como todos los años, el 31 de octubre es la fecha en la que se arma una pequeña polémica por los eventos festivos que se celebran ese día: ¿Bailar en una fiesta de disfraces o jaranear al ritmo de la música criolla?, las preferencias y las ofertas para divertirse esa noche suele ser muy variadas.\n" +
                        "\n" +
                        "El 31 de octubre, el Perú celebra el Día de la Canción Criolla. Las principales celebraciones siempre tienen lugar en la costa peruana, donde la ‘música criolla’, tiene gran arraigo, pero este día también es celebrado en todo el Perú, un hecho interesante es que, el 31 de octubre también se celebra Halloween."));
        festividades.add(new ItemLista(R.drawable.todos_los_santos_cusco,"Todos los Santos", "01 de Noviembre",
                "Una de las fiestas tradicionales en Cusco es el Día de Todos los Santos, día en el que tal vez nos aferremos a la idea de que algún día el cielo será nuestra futura patria. Aunque son muy contados los que tienen grandes ambiciones de ser santos o imitar a los incontables cristianos, declarados o no, como santos por la Iglesia Católica.\n" +
                        "\n" +
                        "Fecha del Calendario Religioso. En nuestra cultura, se celebra el 1 de noviembre y lo festejan quienes aún permanecen vivos en este mundo terrenal; mientras que el 2 de noviembre se recuerda el día de los difuntos con romería a los cementerios con grupos de música y danza. Los deudos delante de la tumba del difunto brindan con abundante chicha, cerveza y le ofrecen la comida, frutas y todo aquello que en vida degustaba agradablemente el finado."));
        festividades.add(new ItemLista(R.drawable.santurantikuy,"El Santurantikuy", "24 de Diciembre",
                "La celebración mundial de la navidad en el Cusco adquiere contornos especiales, pues en torno a ella hay diversas actividades. La ciudad vive un ambiente festivo con el arreglo de los balcones del Centro Monumental, con luces, guirnaldas y motivos navideños. La Municipalidad desde los primeros días del mes de diciembre coloca hermosas alegorías luminosas que alegran las noches de la ciudad.\n" +
                        "\n" +
                        "Cada 24 de diciembre, en la Plaza Mayor se realiza la feria más grande de arte popular y costumbrista del Perú: La feria del Santurantikuy, donde centenares de artesanos provenientes de distintos lugares del Cusco y de otras regiones del país, exponen hermosos y originales trabajos fruto de su espíritu creador a lo largo del año y los cuales adornarán los nacimientos de hogares e instituciones. El Niño Manuelito es el personaje central de la fiesta de la navidad en Cusco."));
        festividades.add(new ItemLista(R.drawable.anio_nuevo_en_cusco,"Año Nuevo en Cusco","31 de Diciembre","La ciudad de Cusco, “el ombligo del mundo”, es uno de los lugares más especiales para esperar con desbordante alegría y esperanza el advenimiento del “Año Nuevo”, que será una noche mágica donde la celebración se lleva a cabo con personas de todo el mundo, esta fiesta se realiza en la Plaza Mayor de la ciudad del Cusco o Plaza de Armas.\n" +
                "\n" +
                "En Cusco, la víspera de año nuevo es un evento desenfrenado, emocionante, y divertidísimo. Es caracterizado por conciertos gratuitos, fuegos artificiales, bebidas diversas, y divertidas tradiciones locales. ¡Descubre para ti mismo por qué la antigua ciudad imperial de los Incas es la ciudad más popular de Perú para celebrar las fiestas!"));

    }
}
