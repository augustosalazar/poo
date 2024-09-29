package com.uninorte;
import java.util.ArrayList;

public class ConsultDoctor extends Doctor {
    private ArrayList<Patient> patients;
    private Team leaderOf;

    public ConsultDoctor(int id,  Team team){
        super(id, team);
        team.setTeamLeader(this);
        this.patients = new ArrayList<>();
    }

    public Team getTeam() {
        return leaderOf;
    }

    public void setTeam(Team team) {
        this.leaderOf = team;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }
}