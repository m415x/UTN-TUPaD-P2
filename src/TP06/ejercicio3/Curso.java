package TP06.ejercicio3;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        // Remover de la lista del profesor anterior
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }

        // Asignar nuevo profesor
        this.profesor = profesor;

        // Agregar a la lista del nuevo profesor
        if (profesor != null) {
            profesor.agregarCurso(this);
        }
    }

    public String getNombreProfesor() {
        return (profesor != null) ? profesor.getNombre() : "Sin asignar";
    }

    public void mostrarInfo() {
        System.out.println("Curso{codigo=" + codigo
                + ", nombre=" + nombre
                + ", profesor=" + getNombreProfesor() + "}");
    }

    @Override
    public String toString() {
        String profesorInfo = (profesor != null)
                ? profesor.getNombre()
                : "Sin asignar";
        return "Curso{codigo=" + codigo
                + ", nombre=" + nombre
                + ", profesor=" + profesorInfo + "}";
    }
}
