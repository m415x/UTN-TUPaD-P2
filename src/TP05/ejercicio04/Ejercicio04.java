package TP05.ejercicio04;

public class Ejercicio04 {
    
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "30-50000000-6");
        Cliente cliente = new Cliente("Carlos Rodríguez", "40123456");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(
                "1234-5678-9012-3456", "12/2027", banco);
        tarjeta.setCliente(cliente);
        
        System.out.println("--- Información del cliente ---");
        cliente.imprimirDatosCliente();
        System.out.println("\n--- Información de la tarjeta ---");
        tarjeta.imprimirDatosTarjeta();
        System.out.println("\n--- Información del banco ---");
        banco.imprimirDatosBanco();
    }
}