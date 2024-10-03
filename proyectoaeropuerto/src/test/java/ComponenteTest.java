
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.uninorte.Avion;
import com.uninorte.Componente;
import com.uninorte.Equipo;

public class ComponenteTest {
    private Componente componente;
    private Avion avion;

    @BeforeAll
    public void setUp() {
        avion = new Avion(101, new Equipo(1));
        componente = new Componente(201, avion);
    }

    @Test
    public void testGetId() {
        assertEquals(201, componente.getId());
    }

    @Test
    public void testGetAvion() {
        assertEquals(avion, componente.getAvion());
    }
}
