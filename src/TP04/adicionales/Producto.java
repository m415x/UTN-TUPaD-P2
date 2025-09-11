package TP04.adicionales;

public class Producto {
    
    private static double IVA = 0.21;
    
    private String nombre;
    private double precioBase; 

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    
    public Producto(String nombre) {
        this(nombre, 100);
    }
    
    public void aplicarDescuento(double descuento) {
        this.precioBase -= precioBase * descuento;
    }
    
    public void aplicarDescuento(double descuento, double precioMinimo) {
        if (precioBase * (1 - descuento) >= precioMinimo) {
            this.precioBase -= precioBase * descuento;
        } else {
            this.precioBase = precioMinimo;
        }
    }
    
    public double calcularPrecioFinal() {
        return this.precioBase * (1 + IVA);
    }
    
    public static void cambiarIVA(double nuevo) {
        Producto.IVA = nuevo;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre 
                + "\nPrecio Base: $" + String.format("%.2f", precioBase)
                + "\nPrecio Final (IVA " + (IVA * 100)+ " %): $" 
                + String.format("%.2f", calcularPrecioFinal()) + "\n";
    }
}
