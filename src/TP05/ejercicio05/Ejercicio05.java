package TP05.ejercicio05;

public class Ejercicio05 {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Ana Martínez", "35123456");
        Computadora computadora = new Computadora(
                "Dell", "DLXPS12345", "ASUS ROG Strix", "Intel Z790");
        computadora.setPropietario(propietario);
        
        System.out.println("--- Información del propietario ---");
        propietario.imprimirDatosPropietario();
        System.out.println("\n--- Información de la computadora ---");
        computadora.imprimirDatosComputadora();
        System.out.println("\n--- Especificaciones de la placa madre ---");
        computadora.getPlacaMadre().imprimirEspecificaciones();
    }
}