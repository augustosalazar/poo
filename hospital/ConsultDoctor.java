import java.util.ArrayList;

class ConsultDoctor extends Doctor {
    private ArrayList<Patient> patients;
    private Team leaderOf;

    ConsultDoctor(int id,  Team team){
        super(id, team);
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