package TP02;

import java.util.Scanner;

public class ValidarNota {

    public static void main(String[] args) {
        int nota;

        Scanner scan = new Scanner(System.in);

        do {            
            System.out.print("Ingrese una nota (0-10): ");
            nota = scan.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota "
                        + "entre 0 y 10.");
                
            } else {
                System.out.println("Nota guardada correctamente.");
            }
            
        } while (nota < 0 || nota > 10);
    }
}
