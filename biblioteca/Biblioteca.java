import java.util.ArrayList;

class Biblioteca {

    private ArrayList<Usuario> usuarios;
    public ArrayList<Autor> autores;

    Biblioteca() {
        this.usuarios = new ArrayList<Usuario>();
        this.autores = new ArrayList<Autor>();
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public Usuario getUsuarioMayorNumReservas() {
        int mayor = 0;
        Usuario usuarioMayor = null;
        for (Usuario usuario : usuarios) {
            int numReservas = usuario.getNumReservas();

            if (numReservas > mayor) {
                mayor = numReservas;
                usuarioMayor = usuario;
            }
        }

        return usuarioMayor;
    }

    public void getUsuarioConMayorNumResenasPorCadaAutor(){
        Usuario elUsuario;
        for (Autor autor : autores) {
            elUsuario = autor.getUsuarioConMayorNumResenas();
            System.out.println("El usuario con mayor número de reseñas para el autor " + autor.getId() + " es: " + elUsuario.getId());
        }
    }

    public static void main(String[] args) {
        System.out.println("Bem-vindo à biblioteca!");
    }

}