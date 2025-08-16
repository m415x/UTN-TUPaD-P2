package TP02;

import java.util.Scanner;

public class VerificarAnioBisiesto {

    public static void main(String[] args) {
        int anio;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese un a�o: ");
        anio = scan.nextInt();
        
        if ((anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0)) {
            System.out.printf("El a�o %d es bisiesto\n", anio);
            
        } else {
            System.out.printf("El a�o %d no es bisiesto\n", anio);
        }
    }
}
