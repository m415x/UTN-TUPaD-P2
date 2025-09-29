package TP06.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    public void eliminarCurso(Curso curso) {
        cursos.remove(curso);
    }

    public void mostrarInfo() {
        System.out.println("Profesor{id=" + id 
                + ", nombre=" + nombre 
                + ", especialidad=" + especialidad + "}");
        System.out.println("Cursos a cargo (" + cursos.size() + "):");
        for (Curso curso : cursos) {
            System.out.println("  - " + curso.getNombre() 
                    + " (" + curso.getCodigo() + ")");
        }
    }
    
    public String getInfoReporte() {
        return "El Profesor " + nombre + " tiene " + cursos.size() + " cursos a cargo.";
    }
    
    public int getCantidadCursos() {
        return cursos.size();
    }

    @Override
    public String toString() {
        return "Profesor{id=" + id 
                + ", nombre=" + nombre 
                + ", especialidad=" + especialidad + "}";
    }
}
