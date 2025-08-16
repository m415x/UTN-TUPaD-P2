package TP02;

import java.util.Scanner;

public class SumaDeNumerosPares {

    public static void main(String[] args) {
        int num, suma = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese un número (0 para terminar): ");
        num = scan.nextInt();
        
        while(num != 0){
            if (num % 2 == 0) suma += num;
            
            System.out.print("Ingrese un número (0 para terminar): ");
            num = scan.nextInt();
        }
        System.out.println("La suma de los números pares es: " + suma);
    }
}
