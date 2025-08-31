package TP04;

public class Main {
    
    public static void main(String[] args) {
        // Instanciar 4 objetos Empleado
        Empleado em1 = new Empleado(11, "Juan Perez", "Soporte Técnico", 1500);
        Empleado em2 = new Empleado("Jésica Morales", "Secretaría Técnica");
        Empleado em3 = new Empleado("Miguel López", "Recepción");
        Empleado em4 = new Empleado(6, "Teresa Rodriguez", "RRHH", 2000);

        // Mostrar estado inicial
        System.out.println(em1);
        System.out.println(em2);
        System.out.println(em3);
        System.out.println(em4);
        
        // Actualizar salario y mostrar estado 
        System.out.println("-> Actualizar salario '15 porciento'");
        em1.actualizarSalario("15 porciento");
        System.out.println(em1);
        
        System.out.println("-> Actualizar salario 650");
        em2.actualizarSalario(650);
        System.out.println(em2);
        
        System.out.println("-> Actualizar salario -300");
        em3.actualizarSalario(-300);
        System.out.println(em3);
        
        // Llamar método de clase
        System.out.printf(
                "Se registraron %d empleados\n", 
                Empleado.mostrarTotalEmpleados()
        );
    }
}
