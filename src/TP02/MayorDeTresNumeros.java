package TP02;

import java.util.Scanner;

public class MayorDeTresNumeros {

    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        num1 = scan.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = scan.nextInt();

        System.out.print("Ingrese el tercer número: ");
        num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es: " + num1);

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es: " + num2);

        } else {
            System.out.println("El mayor es: " + num3);
        }
    }
}
