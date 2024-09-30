package com.uninorte;

import java.util.ArrayList;
import java.util.List;

public class Edicion {
    private Revista revista;
    private List<Articulo> articulos;

    public Edicion(Revista revista) {
        this.revista = revista;
        this.articulos = new ArrayList<>();
    }

    public void addArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    // Getters and setters
    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }
}
