package TP01;

import java.util.Scanner;

public class EntradaDeDatosDeUsuario {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nombre;
        int edad;
                
        System.out.print("Ingrese su nombre -> ");
        nombre = scan.nextLine();
        
        System.out.print("Ingrese su edad -> ");
        edad = Integer.parseInt(scan.nextLine());
        
        System.out.printf("Su nombre es %s y tiene %d años\n", nombre, edad);
    }

}
