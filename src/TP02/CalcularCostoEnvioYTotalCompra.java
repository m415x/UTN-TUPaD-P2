package TP02;

import java.util.Scanner;

public class CalcularCostoEnvioYTotalCompra {

    public static void main(String[] args) {
        double peso = 1, precio = 0, envio;
        String zona = "";
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(scan.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(scan.nextLine());
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = scan.nextLine();
        
        envio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envío es: " + envio);
        System.out.println("El total a pagar es: " 
                + calcularTotalCompra(precio, envio));
    }
    
    /**
     * Método que calcula el costo de envío basado en la zona de envío 
     * (Nacional o Internacional) y el peso del paquete.
     * 
     * @param peso
     * @param zona
     * @return costo de envío por peso según zona
     */
    public static double calcularCostoEnvio(double peso, String zona) {
        
        return (zona.equalsIgnoreCase("Nacional")) ? 5 * peso : 10 * peso;
    }

    /**
     * Método que calcula el total a pagar por el producto.
     * @param precioProducto
     * @param costoEnvio
     * @return total a pagar
     */
    public static double calcularTotalCompra(
            double precioProducto, 
            double costoEnvio
    ) {
        
        return precioProducto + costoEnvio;
    }
}