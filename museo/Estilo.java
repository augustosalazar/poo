import java.lang.reflect.Array;
import java.util.ArrayList;

class Estilo {
    private int id;
    private String nombre;
    private ArrayList<Obra> obras;
    private ArrayList<Artista> artistas;

    Estilo(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.obras = new ArrayList<>();
        this.artistas = new ArrayList<>();
    }


}