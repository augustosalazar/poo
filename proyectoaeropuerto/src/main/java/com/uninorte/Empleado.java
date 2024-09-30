package com.uninorte;
import java.util.ArrayList;

public class Empleado {
    private int id;
    private ArrayList<Equipo> equipos;

    public Empleado(int id) {
        this.id = id;
        this.equipos = new ArrayList<>();
    }

    public void addEquipo(Equipo equipo) {
        this.equipos.add(equipo);
    }

    public int getId() {
        return id;
    }

    public int getNumeroEquipos() {
        return this.equipos.size();
    }
}
