package TP02;

import java.util.Scanner;

public class ActualizarStock {

    public static void main(String[] args) {
        int stock, vendido, recibido;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        stock = scan.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        vendido = scan.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        recibido = scan.nextInt();

        System.out.println("El nuevo stock del producto es: "
                + actualizarStock(stock, vendido, recibido));
    }

    /**
     * Método que calcula el nuevo stock después de una venta y recepción de
     * productos.
     *
     * @param stockActual
     * @param cantidadVendida
     * @param cantidadRecibida
     * @return cantidad de unidades disponibles después de actualizar el stock
     */
    public static int actualizarStock(
            int stockActual,
            int cantidadVendida,
            int cantidadRecibida
    ) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
