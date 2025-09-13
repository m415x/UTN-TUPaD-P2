package TP05.ejercicio09;

public class Profesional {
    
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void imprimirDatosProfesional() {
        System.out.println("Profesional: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }

    @Override
    public String toString() {
        return "Profesional{" + "nombre=" + nombre 
                + ", especialidad=" + especialidad + '}';
    }
}