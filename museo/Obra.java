class Obra {
    private int id;
    private String nombre;
    private Museo museo;
    private Artista artista;
    private Estilo estilo;

    Obra(int id, String nombre, Museo museo, Artista artista, Estilo estilo){
        this.id = id;
        this.nombre = nombre;
        this.museo = museo;
        this.artista = artista;
        this.estilo = estilo;

        artista.addObra(this);
        estilo.addObra(this);
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public Artista getArtista() {
        return artista;
    }
}