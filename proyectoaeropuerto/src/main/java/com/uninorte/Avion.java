package com.uninorte;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Avion {
    private int id;
    private Equipo equipo;
    private ArrayList<Componente> componentes;

    public Avion(int id, Equipo equipo) {
        this.id = id;
        this.equipo = equipo;
    }

    public int getId() {
        return id;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void addComponente(int id) {
        this.componentes.add(new Componente(id, this));
    }

    public int getNumeroComponentes() {
        return this.componentes.size();
    }
    
}
