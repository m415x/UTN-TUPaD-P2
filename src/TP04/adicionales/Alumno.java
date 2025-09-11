package TP04.adicionales;

public class Alumno {
    
    private static double notaAprobacion = 6;
    
    private String nombre;
    private double promedio;

    public Alumno(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public Alumno(String nombre) {
        this(nombre, 0);
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void setPromedio(double[] notasArr) {
        double suma = 0;
        
        for (double nota : notasArr) {
            suma += nota;
        }
        
        this.promedio = suma / notasArr.length;
    }
    
    private boolean aprobo() {
        return this.promedio >= Alumno.notaAprobacion;
    }
    
    public static void cambiarNotaAprobacion(double nueva) {
        Alumno.notaAprobacion = nueva;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre 
                + "\nPromedio: " + promedio 
                + "\nCondición: " + (aprobo() ? "Aprobado\n" : "Reprobado\n");
    }
}
