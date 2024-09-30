package com.uninorte;

import java.util.ArrayList;
import java.util.List;

public class ComiteEditorial {
    private List<Persona> miembros;

    public ComiteEditorial() {
        this.miembros = new ArrayList<>();
    }

    public void addMiembro(Persona miembro) {
        miembros.add(miembro);
    }

    // Getters and setters
    public List<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<Persona> miembros) {
        this.miembros = miembros;
    }
}
