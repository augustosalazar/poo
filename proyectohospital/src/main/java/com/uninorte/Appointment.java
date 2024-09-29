package com.uninorte;
public class Appointment {
    private int id;
    private Doctor doctor;
    private Patient patient;

    // Constructor
    public Appointment(int id, Doctor doctor, Patient patient) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
    }
}
