package com.uninorte;
import java.util.ArrayList;

public class Team {
    private int id;
    private ConsultDoctor teamLeader;
    private ArrayList<Doctor> doctores;
    private ArrayList<Patient> patients;

    public Team(int id) {
        this.id = id; 

        this.doctores = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void setTeamLeader(ConsultDoctor teamLeader) {
        this.teamLeader = teamLeader;
    }

    // Constructor
    public Team(int id, ConsultDoctor teamLeader) {
        this.id = id; 
        this.teamLeader = teamLeader;

        this.doctores = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public int getId(){
        return id; 
    }

    public void addDoctor(Doctor doctor){
        doctores.add(doctor);
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public ConsultDoctor getConsultDoctor() {
        return teamLeader;
    }


}