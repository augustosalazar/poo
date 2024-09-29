package com.uninorte;
import java.util.ArrayList;

public class Ward{
    
    private int id;
    private ArrayList<Patient> patients;

    public Ward(int id){
        patients= new ArrayList<Patient>();
        this.id = id;
    }
    public int getID(){
        return id;
    }
    public void addPatients(Patient patient){
        patients.add(patient);
    }
    public Integer getNumberOfPatients() {
        return patients.size();
    }
}
