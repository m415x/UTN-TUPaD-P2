package TP01;

import java.util.Scanner;

public class OperacionesAritmeticas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.println("Operaciones Aritm�ticas");

        System.out.print("Ingrese el primer n�mero que desea operar -> ");
        num1 = scan.nextInt();

        System.out.print("Ingrese el segundo n�mero que desea operar -> ");
        num2 = scan.nextInt();

        System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
        System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
        System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
        System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
    }

}
