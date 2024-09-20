import java.util.ArrayList;

public class Autor {

    private  ArrayList<ResenaAutor> resenas;
    private int id;
    

    Autor(int id) {
        this.id = id;
        this.resenas = new ArrayList<ResenaAutor>();
    }


    public Usuario getUsuarioConMayorNumResenas(){

    }

    public int getId() {
        return id;
    }
    
}
