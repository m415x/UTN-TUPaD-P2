package TP04.adicionales;

public class EjerciciosAdicionales {

    public static void main(String[] args) {
        
        /* CLASE LIBRO */
        Libro libro1 = new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez");
        Libro libro2 = new Libro("Jurassic Park", "Michael Crichton");
        Libro libro3 = new Libro("The Silmarillion", "J. R. R. Tolkien", "Planeta");
        
        libro2.setTitulo("Parque Jurásico");
        libro3.setTitulo("Edición Traducida", "El Silmarillion");
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        
        Libro.setEditorial("El Planeta");

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        
        /* CLASE ALUMNO */
        Alumno alumno1 = new Alumno("Alejandro");
        Alumno alumno2 = new Alumno("Ariana", 9);
        Alumno alumno3 = new Alumno("Cristian");
        Alumno alumno4 = new Alumno("Gerónimo", 10);
        
        alumno1.setPromedio(8);
        double[] notas = {5, 6, 6};
        alumno3.setPromedio(notas);
        
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
        System.out.println(alumno4);
        
        Alumno.cambiarNotaAprobacion(5);
        
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
        System.out.println(alumno4);
        
        /* CLASE PRODUCTO */
        Producto prod1 = new Producto("Televisor");
        Producto prod2 = new Producto("Lavarropas", 120);
        Producto prod3 = new Producto("Celular");
        Producto prod4 = new Producto("Microondas", 70);
        
        prod1.aplicarDescuento(0.2);
        prod4.aplicarDescuento(0.5, 55);
        
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        System.out.println(prod4);
        
        Producto.cambiarIVA(0.105);
        
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        System.out.println(prod4);
        
        /* CLASE CUENTA */
        Cuenta cuenta1 = new Cuenta("Juan Perez", 1000);
        Cuenta cuenta2 = new Cuenta("John Doe");
        Cuenta cuenta3 = new Cuenta("Juan Palotes", 850.5);
        Cuenta cuenta4 = new Cuenta("Pepe Hongo");
        
        System.out.println(cuenta1.consultarSaldo());
        System.out.println(cuenta2.consultarSaldo());
        System.out.println(cuenta3.consultarSaldo(1435));
        System.out.println(cuenta4.consultarSaldo());
        
        cuenta2.depositar(1800);
        cuenta4.depositar(-50);
        cuenta1.extraer(1500);
        cuenta3.extraer(850);
        
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        System.out.println(cuenta4);
        
        System.out.println(Cuenta.mostrarTotalCuentas());
    }
}
