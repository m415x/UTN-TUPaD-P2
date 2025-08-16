package TP02;

import java.util.Scanner;

public class ClasificarEdad {

    public static void main(String[] args) {
        int edad;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        edad = scan.nextInt();

        if (edad < 12) {
            System.out.println("Eres un Niño");

        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente");

        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto");

        } else if (edad >= 60) {
            System.out.println("Eres un Adulto mayor");
        }
    }
}
