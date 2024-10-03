package com.uninorte;

import java.util.ArrayList;

public class Aeropuerto {
    private ArrayList<Avion> aviones;
    private ArrayList<Equipo> equipos;

    public Aeropuerto() {
        this.aviones = new ArrayList<>();
        this.equipos = new ArrayList<>();
    }

    public void addAvion(Avion avion) {
        this.aviones.add(avion);
    }

    public void addEquipo(Equipo equipo) {
        this.equipos.add(equipo);
    }

    public int getNumeroAviones() {
        return this.aviones.size();
    }

    public int getNumeroEquipos() {
        return this.equipos.size();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
