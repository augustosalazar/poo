package com.uninorte;
import java.util.ArrayList;

abstract public class Doctor {
    private Team team;
    private int id;
    private ArrayList<Appointment> appointments;

    // Constructor
    public Doctor(int id, Team team) {
        this.team = team;
        this.id = id; 
        appointments = new ArrayList<>();
        team.addDoctor(this);
    }

    public int getId(){
        return id; 
    }

    public Team getTeam(){
        return team;
    }

    public void addAppointment(Appointment appointment){
        appointments.add(appointment);
    }

    public Integer getNumberOfAppointments() {
        return appointments.size();
    }

}