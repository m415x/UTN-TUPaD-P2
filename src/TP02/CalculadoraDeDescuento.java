package TP02;

import java.util.Scanner;

public class CalculadoraDeDescuento {

    public static void main(String[] args) {
        double precio, precioFinal;
        char categoria;
        String descuentoAplicado;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(scan.nextLine());

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        categoria = scan.next().charAt(0);

        switch (categoria) {
            case 'A':
                descuentoAplicado = "10%";
                precioFinal = precio * 0.9;
                break;

            case 'B':
                descuentoAplicado = "15%";
                precioFinal = precio * 0.85;
                break;

            case 'C':
                descuentoAplicado = "20%";
                precioFinal = precio * 0.8;
                break;

            default:
                System.out.println("Categoría incorrecta!");
                descuentoAplicado = "Ninguno";
                precioFinal = precio;
        }
        System.out.println("Descuento aplicado: " + descuentoAplicado);
        System.out.println("Precio final: " + precioFinal);
    }
}
