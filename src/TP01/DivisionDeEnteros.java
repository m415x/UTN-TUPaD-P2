package TP01;

import java.util.Scanner;

public class DivisionDeEnteros {

    public static void main(String[] args) {
        int int1, int2;
        double double1, double2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Division con int vs double");
        System.out.print("Ingrese el primer n�mero entero -> ");
        int1 = scan.nextInt();
        double1 = (double) int1;
        System.out.print("Ingrese el segundo n�mero entero -> ");
        int2 = scan.nextInt();
        double2 = (double) int2;
        System.out.println(
                "Divisi�n entera:\n"
                + int1 + " / " + int2 + " = " + (int1 / int2) + "\n"
                + "Divisi�n decimal:\n"
                + double1 + " / " + double2 + " = " + (double1 / double2)
        );
    }

}
