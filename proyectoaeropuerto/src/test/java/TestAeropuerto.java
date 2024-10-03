import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.uninorte.Aeropuerto;
import com.uninorte.Avion;
import com.uninorte.Equipo;

public class TestAeropuerto {
    
    private Aeropuerto aeropuerto;

    @BeforeAll
    public void setUp() {
        aeropuerto = new Aeropuerto();
    }

    @Test
    public void testAddAvion() {
        Avion avion = new Avion(101, new Equipo(1));
        aeropuerto.addAvion(avion);
        assertEquals(1, aeropuerto.getNumeroAviones());
    }

    @Test
    public void testAddEquipo() {
        Equipo equipo = new Equipo(501);
        aeropuerto.addEquipo(equipo);
        assertEquals(1, aeropuerto.getNumeroEquipos());
    }
}
