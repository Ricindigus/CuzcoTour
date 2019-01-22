package com.example.ricindigus.cuzcotour.pojos;

public class ItemLista {
    private int imagen;
    private String titulo;
    private String fecha;
    private String descripcion;

    public ItemLista(int imagen, String titulo, String fecha, String descripcion) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.fecha = fecha;

        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
