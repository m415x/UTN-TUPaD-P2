package TP08.parte1;

public class Servicio implements Vendible {

    private String descripcion;
    private double precioHora;
    private int horasTrabajadas;

    public Servicio(String descripcion, double precioHora, int horasTrabajadas) {
        this.descripcion = descripcion;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioHora * horasTrabajadas;
    }

    @Override
    public String toString() {
        return descripcion + " - Precio final: $" + String.format("%.2f", calcularPrecioFinal());
    }

}
