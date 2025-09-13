package TP05.ejercicio06;

public class Ejercicio06 {
    public static void main(String[] args) {
        Mesa mesa = new Mesa(5, 4);
        Cliente cliente = new Cliente("Laura González", "11-2345-6789");
        Reserva reserva = new Reserva("2024-03-20", "20:30", mesa);
        reserva.setCliente(cliente);
        
        reserva.imprimirDatosReserva();
        System.out.println("\n--- Información del cliente ---");
        cliente.imprimirDatosCliente();
        System.out.println("\n--- Información de la mesa ---");
        mesa.imprimirDatosMesa();
    }
}