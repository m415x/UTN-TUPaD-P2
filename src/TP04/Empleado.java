package TP04;

import java.util.Random;

public class Empleado {

    // Atributos de Clase
    private static int totalEmpleados;
    private static final double SALARIO_BASE = 1000;

    // Atributos de Instancia
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private int numeroEmpleado;

    // Sobrecarga de método Constructor
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.numeroEmpleado = ++totalEmpleados;
    }

    public Empleado(String nombre, String puesto) {
        Random random = new Random();
        this.id = random.nextInt(99) + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_BASE;
        this.numeroEmpleado = ++totalEmpleados;
    }

    // Método de Clase
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Métodos de Instancia
    public void actualizarSalario(double salario) {
        if (salario > 0) {
            this.salario += salario;
        } else {
            System.out.println("No se puede utilizar un valor negativo");
        }
    }

    public void actualizarSalario(String porcentaje) {
        porcentaje = porcentaje.replaceAll("[^0-9]+", "");
        if (!porcentaje.isEmpty()) {
            double porcentajeAumento = Double.parseDouble(porcentaje) / 100;
            if (porcentajeAumento > 0) {
                this.salario *= porcentajeAumento + 1;
            }
        } else {
            System.out.println("Formato de porcentaje inválido");
        }
    }

    // Sobreescribir método toString()
    @Override
    public String toString() {
        return "Empleado #" + numeroEmpleado + " {"
                + "\n\tid: " + id
                + "\n\tnombre: " + nombre
                + "\n\tpuesto: " + puesto
                + "\n\tsalario: $" + Math.round(salario * 100.0) / 100.0
                + "\n}\n";
    }
}
