import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.uninorte.*;

public class EquipoTest {
    private Equipo equipo;

    @Before
    public void setUp() {
        equipo = new Equipo(501);
    }

    @Test
    public void testAddEmpleado() {
        Empleado empleado = new Empleado(601);
        equipo.addEmpleado(empleado);
        assertEquals(1, equipo.getEmpleados().size());
    }

    @Test
    public void testAddEquipo() {
        Equipo subEquipo = new Equipo(701);
        equipo.addEquipo(subEquipo);
        assertEquals(1, equipo.getEquipos().size());
    }
}
