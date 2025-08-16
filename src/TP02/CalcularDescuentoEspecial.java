package TP02;

import java.util.Scanner;

public class CalcularDescuentoEspecial {

    public static double descuentoEspecial = 0.10;

    public static void main(String[] args) {
        double precio;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        precio = scan.nextDouble();

        calcularDescuentoEspecial(precio);
    }

    /**
     * Método que calcula y muestra el descuento especial y el precio final.
     *
     * @param precio
     */
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoEspecial;

        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: "
                + descuentoAplicado);
        System.out.println("El precio final con descuento es: "
                + precioFinal);
    }
}
