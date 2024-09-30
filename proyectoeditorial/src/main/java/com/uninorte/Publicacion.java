package com.uninorte;

public abstract class Publicacion {
    private int id;
    private String titulo;

    public Publicacion(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    // Getters and setters
    public String getTitulo() {
        return titulo;
    }

}
