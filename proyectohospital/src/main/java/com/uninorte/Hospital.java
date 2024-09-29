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
 
   
    }

    private Team getTeam(int i) {
        for (Team team : teams) {
            if (team.getId() == i) {
                return team;
            }
        }
        return null;
    }

    public void addJuniorDoctor(int idTeam, int idJuniorDoctor) {
        Team team = getTeam(idTeam);
        JuniorDoctor juniorDoctor = new JuniorDoctor(idJuniorDoctor, team);
        
    }

    public void createTeam(int i, int j) {
        Team team = new Team(i);
        new ConsultDoctor(j, team);
        addTeam(team);
    }

    public Integer getNumberOfWards() {
        return wards.size();
    }

    public int getTeaamWithMostDoctors() {
        int max = 0;
        int teamId = 0;
        for (Team team : teams) {
            if (team.getNumberOfDoctors() > max) {
                max = team.getNumberOfDoctors();
                teamId = team.getId();
            }
        }
        return teamId;
    }

    public int getNumberOfTeams() {
        return teams.size();
    }

}
