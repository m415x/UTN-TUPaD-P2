package TP02;

public class ModificarArrayDePrecios {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399, 89.99};
        
        System.out.println("Precios originales:");
        mostrarPrecios(precios);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados:");
        mostrarPrecios(precios);
    }

    /**
     * Método que muestra los precios almacenados en un array.
     * 
     * @param precios 
     */
    public static void mostrarPrecios(double[] precios) {
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}