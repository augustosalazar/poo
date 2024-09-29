import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class HospitalTest {
    
    @Test
    public void testDoctor() {
        Team team = new Team(1);
        Doctor doctor = new Doctor(1, team);
        assertEquals(1, doctor.getId());
        assertEquals(team, doctor.getTeam());
    }

    @Test
    public void testWard() {
        Ward ward = new Ward(1);
        assertEquals(1, ward.getID());
    }

    @Test
    public void testAppointment() {
        Team team = new Team(1);
        Doctor doctor = new Doctor(1, team);
        Patient patient = new Patient(1);
        Appointment appointment = new Appointment(1, doctor, patient);
    }

}
