import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import com.uninorte.*;

public class HospitalTest {
    
    @Test
    public void testAppointment() {
        Team team = new Team(1);
        ConsultDoctor consultDoctor = new ConsultDoctor(1, team);
        JuniorDoctor juniorDoctor = new JuniorDoctor(2, team);
        Ward ward = new Ward(1);
        Patient patient = new Patient(1, ward, team);
        Appointment appointment = new Appointment(1, juniorDoctor, patient);
        assertEquals(1, patient.getNumberOfAppointments());
        assertEquals(1, juniorDoctor.getNumberOfAppointments());
    }

    @Test
    public void testTeam() {
        Team team = new Team(1);
        ConsultDoctor consultDoctor = new ConsultDoctor(1, team);
        JuniorDoctor juniorDoctor = new JuniorDoctor(2, team);
        assertEquals(consultDoctor, team.getConsultDoctor());
        assertEquals(2, team.getNumberOfDoctors());
    }

    @Test
    public void testWard() {
        Ward ward = new Ward(1);
        Ward ward2 = new Ward(2);

        Team team = new Team(1);
        new ConsultDoctor(1, team);
        
        new Patient(1, ward, team);
        new Patient(2, ward2, team);
        new Patient(3, ward, team);
        assertEquals(2, ward.getNumberOfPatients());
        assertEquals(1, ward2.getNumberOfPatients());
    }

    @Test
    public void testHospitalLogic() {
        Hospital hospital = new Hospital();
        hospital.createTeam(0, 0+10); // 0 es el id del equipo, id del equipo mas 10 es el id del ConsultantDoctor

        hospital.createTeam(1, 1+10); // 1 es el id del equipo, id del equipo mas 10 es el id del ConsultantDoctor

        hospital.addJuniorDoctor(0, 0+100); // el id del equipo es 0, el id del JuniorDoctor es 100
        hospital.addJuniorDoctor(0, 0+101); // el id del equipo es 0, el id del JuniorDoctor es 101
        hospital.addJuniorDoctor(0, 0+102); // el id del equipo es 0, el id del JuniorDoctor es 102

        hospital.addJuniorDoctor(1, (1*10)+100); // el id del equipo es 1, el id del JuniorDoctor es 101
        hospital.addJuniorDoctor(1, (1*10)+101); // el id del equipo es 1, el id del JuniorDoctor es 101

        assertEquals(2, hospital.getNumberOfTeams());

        assertEquals(0, hospital.getTeaamWithMostDoctors());

    }

}
