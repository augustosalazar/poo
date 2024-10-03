import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.uninorte.*;

public class EmpleadoTest {
    private Empleado empleado;

    @Before
    public void setUp() {
        empleado = new Empleado(301);
    }

    @Test
    public void testGetId() {
        assertEquals(301, empleado.getId());
    }

    @Test
    public void testAddEquipo() {
        Equipo equipo = new Equipo(401);
        empleado.addEquipo(equipo);
        assertEquals(1, empleado.getNumeroEquipos());
    }
}
