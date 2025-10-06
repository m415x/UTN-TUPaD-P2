package TP07.kata3;

public class EmpleadoPlanta extends Empleado {

    private double bono;

    public EmpleadoPlanta(String name, double salarioBase, double bono) {
        super(name, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }

}
