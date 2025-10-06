package TP07.kata3;

public abstract class Empleado {

    public String name;
    public double salarioBase;

    public Empleado(String name, double salarioBase) {
        this.name = name;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

}
