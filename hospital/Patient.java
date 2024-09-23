import java.util.ArrayList;


class Patient{
    private int id;
    private Ward ward;
    private Team team;
    private ConsultDoctor consultDoctor;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appoiments;
   

    public Patient(int id,Ward ward, Team team){
        this.id= id;
        this.ward= ward;
        this.consultDoctor= team.getConsultDoctor();

        doctors= new ArrayList<Doctor>();
        appoiments= new ArrayList<Appointment>();
    }

    public int getID(){
        return id;
    }

    public Ward getWard(){
        return ward;
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    public void addAppointment(Appointment appoiment){
        appoiments.add(appoiment);
    }
}