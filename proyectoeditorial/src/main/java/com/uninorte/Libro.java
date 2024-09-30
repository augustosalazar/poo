package com.uninorte;

import java.util.ArrayList;

public class Libro extends Publicacion {
    private Coleccion coleccion;
    private ArrayList<Persona> autores;

    public Libro(int id, String titulo, Coleccion coleccion, ArrayList<Persona> autores) {
        super(id,titulo);
        this.coleccion = coleccion;
        this.autores = autores;
        coleccion.addLibro(this);
    }

    // Getters and setters
    public Coleccion getColeccion() {
        return coleccion;
    }

    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }

    public int getNumeroAutores() {
        return autores.size();
    }
}
