package TP02;

import java.util.Scanner;

public class CalcularPrecioFinal {

    public static void main(String[] args) {
        double precio, impuesto, descuento;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        precio = scan.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje "
                + "(Ejemplo: 10 para 10%): ");
        impuesto = scan.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje "
                + "(Ejemplo: 5 para 5%): ");
        descuento = scan.nextDouble();

        System.out.println("El precio final del producto es: "
                + calcularPrecioFinal(precio, impuesto, descuento));
    }

    /**
     * Método que solicita el precio base del producto, el porcentaje de
     * impuesto y el porcentaje de descuento, retorna el precio final calculado.
     *
     * @param precioBase
     * @param impuesto
     * @param descuento
     * @return precio final
     */
    public static double calcularPrecioFinal(
            double precioBase,
            double impuesto,
            double descuento
    ) {
        double precioFinal;

        precioFinal = precioBase
                + (precioBase * impuesto / 100)
                - (precioBase * descuento / 100);

        return precioFinal;
    }
}
