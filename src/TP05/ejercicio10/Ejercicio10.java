package TP05.ejercicio10;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        Titular titular = new Titular("Juan Carlos Pérez", "30123456");
        CuentaBancaria cuenta = new CuentaBancaria("0170099540000001234567",
                150000.75, "A1B2C3D4", "2024-03-15 14:33:00");
        cuenta.setTitular(titular);
        
        System.out.println("--- Información del titular ---");
        titular.imprimirDatosTitular();
        System.out.println("\n--- Información de la cuenta ---");
        cuenta.imprimirInformacionCuenta();
        System.out.println("\n--- Información de seguridad ---");
        cuenta.imprimirClave();
    }
}