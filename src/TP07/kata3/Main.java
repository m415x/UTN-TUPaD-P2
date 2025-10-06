package TP07.kata3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList();

        EmpleadoPlanta e1 = new EmpleadoPlanta("Juan Pérez", 700000, 150000);
        EmpleadoPlanta e2 = new EmpleadoPlanta("Pablo Marmol", 560750.5, 0);
        EmpleadoTemporal e3 = new EmpleadoTemporal("Miguel Cervantes", 40, 10000);
        EmpleadoTemporal e4 = new EmpleadoTemporal("Elena Nito", 50, 12358.33);
        
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        
        for (Empleado empleado : empleados) {
            System.out.println(empleado.name + ", salario: $" + empleado.calcularSalario());
        }
    }

}
