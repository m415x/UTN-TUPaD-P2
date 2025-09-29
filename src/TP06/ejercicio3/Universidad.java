package TP06.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public Curso crearCurso(String codigo, String nombre) {
        Curso nuevoCurso = null;
        if (obtenerCursoPorCodigo(codigo) == null) {
            nuevoCurso = new Curso(codigo, nombre);
            cursos.add(nuevoCurso);
        }
        return nuevoCurso;
    }

    public void eliminarCurso(String codigoCurso) {
        Curso cursoAEliminar = obtenerCursoPorCodigo(codigoCurso);
        if (cursoAEliminar != null) {
            eliminarCurso(cursoAEliminar);
        }
    }

    private void eliminarCurso(Curso curso) {
        if (curso != null && cursos.contains(curso)) {

            // Remover el curso de la lista de su profesor
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
        }
    }

    public void agregarProfesor(Profesor profesor) {
        if (profesor != null && !profesores.contains(profesor)) {
            profesores.add(profesor);
        }
    }

    public void eliminarProfesor(Profesor profesor) {
        if (profesor != null && profesores.contains(profesor)) {

            // Dejar sin profesor todos los cursos que dictaba
            for (Curso curso : new ArrayList<>(profesor.getCursos())) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
        }
    }

    public void asignarProfesorACurso(Profesor profesor, String codigoCurso) {
        Curso cursoParaAsignar = obtenerCursoPorCodigo(codigoCurso);
        if (profesor != null
                && cursoParaAsignar != null
                && profesores.contains(profesor)
                && cursos.contains(cursoParaAsignar)) {
            cursoParaAsignar.setProfesor(profesor);
        }
    }

    public void listarCursos() {
        System.out.println("Lista de cursos:\n");
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }

    public void listarProfesores() {
        System.out.println("Lista de profesores:\n");
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
            System.out.println("");
        }
    }

    public void listarCursosYProfesores() {
        listarCursos();
        System.out.println();
        listarProfesores();
    }

    public void cambiarProfesorDeCurso(String codigoCurso, Profesor nuevoProfesor) {
        Curso cursoParaAsignar = obtenerCursoPorCodigo(codigoCurso);
        if (cursoParaAsignar != null
                && nuevoProfesor != null
                && cursos.contains(cursoParaAsignar)
                && profesores.contains(nuevoProfesor)) {
            cursoParaAsignar.setProfesor(nuevoProfesor);
        }
    }

    public void obtenerCantidadCursosPorProfesor() {
        System.out.println("Reporte (cantidad de cursos por profesor):");

        // Mostrar profesor con cantidad de cursos
        for (Profesor profesor : profesores) {
            System.out.println("- " + profesor.getInfoReporte());
        }
    }

    private Curso obtenerCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigo)) {
                return curso;
            }
        }
        return null;
    }

    public String getNombreCurso(String codigoCurso) {
        Curso curso = obtenerCursoPorCodigo(codigoCurso);
        return (curso != null) ? curso.getNombre() : "Curso no encontrado";
    }

    public String getNombreProfesorDeCurso(String codigoCurso) {
        Curso curso = obtenerCursoPorCodigo(codigoCurso);
        return (curso != null) ? curso.getNombreProfesor() : "Profesor no encontrado";
    }

}
