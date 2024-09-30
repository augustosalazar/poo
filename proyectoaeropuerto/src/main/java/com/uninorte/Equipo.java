package com.uninorte;

import java.util.ArrayList;

public class Equipo {
    private int id;
    private ArrayList<Empleado> empleados;
    private ArrayList<Equipo> equipos;
    private Equipo equipoMadre;
    private ArrayList<Avion> aviones;

    public Equipo(int id) {
        this.id = id;
        this.empleados = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.aviones = new ArrayList<>();
    }

    public Equipo(int id, Equipo equipoMadre) {
        this.id = id;
        this.equipoMadre = equipoMadre;
        this.empleados = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.aviones = new ArrayList<>();
    }

    public void addEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public void addEquipo(Equipo equipo) {
        this.equipos.add(equipo);
    }


}
