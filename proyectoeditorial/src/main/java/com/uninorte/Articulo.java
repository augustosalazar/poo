package com.uninorte;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
    private List<Persona> autores;
    private List<Persona> revisores;

    public Articulo() {
        this.autores = new ArrayList<>();
        this.revisores = new ArrayList<>();
    }

    public void addAutor(Persona autor) {
        autores.add(autor);
    }

    public void addRevisor(Persona revisor) {
        revisores.add(revisor);
    }

    // Getters and setters
    public List<Persona> getAutores() {
        return autores;
    }

    public void setAutores(List<Persona> autores) {
        this.autores = autores;
    }

    public List<Persona> getRevisores() {
        return revisores;
    }

    public void setRevisores(List<Persona> revisores) {
        this.revisores = revisores;
    }
}
