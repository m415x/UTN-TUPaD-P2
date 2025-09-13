package TP05.ejercicio01;

import java.time.LocalDate;

public class Ejercicio01 {

    public static void main(String[] args) {
        Titular titular = new Titular("Juan Pérez", "22584759");
        Pasaporte pasaporte = new Pasaporte("x16564S564", LocalDate.now(), 
                "foto_juan", "JPG");
        pasaporte.setTitular(titular);
        
        System.out.println("--- Información del titular ---");
        titular.imprimirInformacionTitular();
        System.out.println("\n--- Información completa del pasaporte ---");
        pasaporte.imprimirInformacionCompleta();
    }

}
