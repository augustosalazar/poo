import java.util.ArrayList; 

public class Usuario {

    private ArrayList<Reserva> reservas;
    private int id;

    Usuario(int id) {
        this.id = id;
        this.reservas = new ArrayList<Reserva>();
    }

    public void adicionarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public int getNumReservas() {
        return this.reservas.size();
    }

    public int getId() {
        return this.id;
    }

}