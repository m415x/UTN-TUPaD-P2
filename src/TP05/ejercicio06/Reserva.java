package TP05.ejercicio06;

public class Reserva {
    
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void imprimirDatosReserva() {
        System.out.println("=== RESERVA ===");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombre());
        }
        if (mesa != null) {
            System.out.println("Mesa: " + mesa.getNumero() 
                    + " (Capacidad: " + mesa.getCapacidad() + " personas)");
        }
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + 
               ", cliente=" + cliente + ", mesa=" + mesa + '}';
    }
}