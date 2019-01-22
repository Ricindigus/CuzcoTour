package com.example.ricindigus.cuzcotour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class DetalleItemActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    int imagen;
    String descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festividad_detalle);



        imagen = getIntent().getExtras().getInt("imagen");
        descripcion = getIntent().getExtras().getString("texto");



        imageView = findViewById(R.id.festividad_imagen);
        textView = findViewById(R.id.festividad_descripcion);
        textView.setMovementMethod(new ScrollingMovementMethod());

        imageView.setImageResource(imagen);
        textView.setText(descripcion);
    }
}
