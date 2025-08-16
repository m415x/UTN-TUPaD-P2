package TP02;

public class ImpresionRecursiva {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399, 89.99};
        
        System.out.println("Precios originales:");
        mostrarPreciosRecursivamente(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados:");
        mostrarPreciosRecursivamente(precios, 0);
    }

    /**
     * Método recursivo para mostrar los precios de un array.
     * 
     * @param precios
     * @param indice 
     */
    public static void mostrarPreciosRecursivamente(
            double[] array, 
            int indice
    ) {
        // Caso base
        if (indice >= array.length) return;
        
        System.out.println("Precio: $" + array[indice]);

        // Llamada recursiva
        mostrarPreciosRecursivamente(array, indice + 1);
    }
}