package com.uninorte;

import java.util.ArrayList;
import java.util.List;

public class Revista extends Publicacion {
    private int id;
    private List<Edicion> ediciones;

    public Revista(int id, String titulo) {
        super(id, titulo);
        this.ediciones = new ArrayList<>();
    }

    public void addEdicion(Edicion edicion) {
        ediciones.add(edicion);
    }

    // Getters and setters
    public List<Edicion> getEdiciones() {
        return ediciones;
    }

    public void setEdiciones(List<Edicion> ediciones) {
        this.ediciones = ediciones;
    }
}
