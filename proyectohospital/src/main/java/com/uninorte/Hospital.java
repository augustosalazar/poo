package com.uninorte;
import java.util.ArrayList;


public class Hospital {
    private ArrayList<Team> teams;
    private ArrayList<Ward> wards;

    public Hospital(){
        teams= new ArrayList<Team>();
        wards= new ArrayList<Ward>();
    }

    public void addTeam(Team team){
        teams.add(team);
    }

    public void addWard(Ward ward){
        wards.add(ward);
    }
    
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.agregarTeam(0, 0+10); // 0 es el id del equipo, id del equipo mas 10 es el id del ConsultantDoctor
        hospital.agregarJuniorDoctor(hospital.getTeam(0), 0+1); // recibe el equipo, el id del equipo mas 20 es el id del doctor 

    
    }

    private Team getTeam(int i) {
        for (Team team : teams) {
            if (team.getId() == i) {
                return team;
            }
        }
        return null;
    }

    private void agregarJuniorDoctor(Team team, int i) {
        JuniorDoctor juniorDoctor = new JuniorDoctor(i, team);
        
    }

    private void agregarTeam(int i, int j) {
        Team team = new Team(i);
        ConsultDoctor consultDoctor = new ConsultDoctor(j, team);
        team.setTeamLeader(consultDoctor);
        addTeam(team);
    }

}
