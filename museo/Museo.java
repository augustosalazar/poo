import java.util.ArrayList;

public class Museo {
    private ArrayList<Obra> obras;
    private ArrayList<Artista> artistas;


    Museo(Obra obra){
        obras = new ArrayList<>();
        artistas = new ArrayList<>();

        obras.add(obra);
        artistas.add(obra.getArtista());
    }

    // las obras no se crean en el museo
    public void agregarObra(Obra obra){
        obras.add(obra);
    }

    // loa artistas no se crean en el museo
    public void agregarArtista(Artista artista){
        artistas.add(artista);
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}