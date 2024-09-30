package com.uninorte;

import java.util.ArrayList;
import java.util.List;

public class Coleccion extends Publicacion {
    private List<Libro> libros;

    public Coleccion(int id, String titulo) {
        super(id, titulo);
        this.libros = new ArrayList<>();
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    // Getters and setters
    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
