package TP03;

public class Estudiante {
    // Atributos de la clase
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    // Métodos de la clase
    public void mostrarInfo() {
        System.out.printf(
                "Estudiante: %s, %s\n"
                + "Curso: %s\n"
                + "Calificación: %.2f\n\n",
                apellido, nombre, curso, calificacion
        );
    }

    public void subirCalificacion(double puntos) {
        if (puntos > 0 && (puntos + calificacion) <= 10) {
            calificacion += puntos;
        }
    }

    public void bajarCalificacion(double puntos) {
        if (puntos > 0 && calificacion >= puntos) {
            calificacion -= puntos;
        }
    }
}
