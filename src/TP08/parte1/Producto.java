package TP08.parte1;

public class Producto implements Vendible {

    private String nombre;
    private double precioBase;
    private double porcentajeDescuento;

    public Producto(String nombre, double precioBase, double porcentajeDescuento) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase - (precioBase * porcentajeDescuento / 100);
    }

    @Override
    public String toString() {
        return nombre + " - Precio final: $" + String.format("%.2f", calcularPrecioFinal());
    }

}
