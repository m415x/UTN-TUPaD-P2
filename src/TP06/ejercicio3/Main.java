package TP06.ejercicio3;

public class Main {

    public static void main(String[] args) {
        // Creamos la universidad
        Universidad utn = new Universidad("Universidad Tecnológica Nacional");

        // Creamos profesores
        Profesor profe1 = new Profesor("P001", "Cinthia Rigoni", "Programación");
        Profesor profe2 = new Profesor("P002", "Gabriela Arguindegui", "Matemáticas");
        Profesor profe3 = new Profesor("P003", "Verónica García", "Inglés");

        // COMPOSICIÓN: La universidad crea los cursos
        utn.crearCurso("C001", "Matemática");
        utn.crearCurso("C002", "Probabilidad y Estadística");
        utn.crearCurso("C003", "Programación I");
        utn.crearCurso("C004", "Programación II");
        utn.crearCurso("C005", "Inglés I");
        utn.crearCurso("C006", "Base de Datos I");
        utn.crearCurso("C007", "Inglés II");

        // Agregamos profesores y cursos a la universidad
        utn.agregarProfesor(profe1);
        utn.agregarProfesor(profe2);
        utn.agregarProfesor(profe3);

        // Asignamos profesores a cursos
        System.out.println("=== ASIGNACIÓN INICIAL DE PROFESORES ===\n");
        utn.asignarProfesorACurso(profe1, "C003");
        utn.asignarProfesorACurso(profe1, "C004");
        utn.asignarProfesorACurso(profe1, "C006");
        utn.asignarProfesorACurso(profe2, "C001");
        utn.asignarProfesorACurso(profe2, "C002");
        utn.asignarProfesorACurso(profe3, "C005");
        utn.asignarProfesorACurso(profe3, "C007");

        utn.listarCursosYProfesores();

        // Cambiamos profesor de un curso
        System.out.println("=== CAMBIO DE PROFESOR EN CURSO ===\n");
        System.out.println("Cambio profesor de " + utn.getNombreCurso("C001")
                + " de " + utn.getNombreProfesorDeCurso("C001")
                + " a " + profe3.getNombre() + "\n");
        utn.cambiarProfesorDeCurso("C001", profe3);

        utn.listarCursosYProfesores();

        // Removemos un curso
        System.out.println("=== ELIMINACIÓN DE CURSO ===\n");
        System.out.println("Se eliminó curso: " 
                + utn.getNombreCurso("C007") + "\n");
        utn.eliminarCurso("C007");

        utn.listarCursosYProfesores();

        // Removemos un profesor
        System.out.println("=== ELIMINACIÓN DE PROFESOR ===\n");
        System.out.println("Eliminando profesor: " + profe2.getNombre() + "\n");
        utn.eliminarProfesor(profe2);

        utn.listarCursosYProfesores();

        // Reporte final
        System.out.println("=== REPORTE FINAL ===\n");
        utn.obtenerCantidadCursosPorProfesor();
    }

}
