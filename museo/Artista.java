import java.util.ArrayList;

class Artista {
    private int id;
    private String nombre;
    private ArrayList<Obra> obras;
    private ArrayList<Estilo> estilos;

    Artista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.obras = new ArrayList<>();
        this.estilos = new ArrayList<>();
    }

    void addObra(Obra obra) {
        obras.add(obra);
        addEstilo(obra.getEstilo());
    }

    void addEstilo(Estilo estilo) {
        // Check if the artist already has the style
        estilos.add(estilo);
    }

}