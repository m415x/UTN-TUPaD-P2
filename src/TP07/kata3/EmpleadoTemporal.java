package TP07.kata3;

public class EmpleadoTemporal extends Empleado {

    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTemporal(String name, int horasTrabajadas, double tarifaPorHora) {
        super(name, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

}
