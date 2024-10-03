import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.uninorte.Avion;
import com.uninorte.Equipo;

public class AvionTest {
    private Avion avion;
    private Equipo equipo;

    @BeforeAll
    public void setUp() {
        equipo = new Equipo(1);
        avion = new Avion(101, equipo);
    }

    @Test
    public void testGetId() {
        assertEquals(101, avion.getId());
    }

    @Test
    public void testGetEquipo() {
        assertEquals(equipo, avion.getEquipo());
    }

    @Test
    public void testAddComponente() {
        avion.addComponente(201);
        assertEquals(1, avion.getNumeroComponentes());
    }
}