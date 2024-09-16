class Obra {
    private Museo museo;
    private int id;
    private String nombre;
    private Artista artista;
    private Estilo estilo;

    Obra(int id, String nombre, Museo museo, Artista artista, Estilo estilo){
        this.id = id;
        this.nombre = nombre;
        this.museo = museo;
        this.artista = artista;
        this.estilo = estilo;
    }
}