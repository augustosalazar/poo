package com.uninorte;

public class Persona {
    private int id;
    private String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

}
