import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.Editorial;

public class TestEditorial {

    @Test
    public void TestAgregarColeccion(){
        Editorial editorial = new Editorial();
        editorial.addColeccion(1, "Coleccion 1");
        assertEquals(1, editorial.getNumeroColecciones());
        editorial.addColeccion(2, "Coleccion 2");
        assertEquals(2, editorial.getNumeroColecciones());
    }

    @Test
    public void TestAgregarLibro(){
        Editorial editorial = new Editorial();
        editorial.addColeccion(1, "Coleccion 1");
        editorial.addLibro(1, "Libro 1", 0, null);
        assertEquals(1, editorial.getNumeroLibros());
        editorial.addLibro(2, "Libro 2", 0, null);
        assertEquals(2, editorial.getNumeroLibros());
    }

    @Test
    public void TestAgregarLibroEnColeccion(){
        Editorial editorial = new Editorial();
        editorial.addColeccion(0, "Coleccion 1");
        editorial.addColeccion(1, "Coleccion 2");
        editorial.addLibro(1, "Libro 1", 0, null);
        editorial.addLibro(2, "Libro 2", 0, null);
        editorial.addLibro(3, "Libro 3", 1, null);
        editorial.addLibro(4, "Libro 4", 1, null);
        editorial.addLibro(5, "Libro 5", 1, null);
        assertEquals(2, editorial.getNumeroLibrosEnColeccion(0));
        assertEquals(3, editorial.getNumeroLibrosEnColeccion(1));
    }
    
}
