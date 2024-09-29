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

}
