package TP05.ejercicio14;

public class Proyecto {
    
    private String nombre;
    private int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void imprimirInfoProyecto() {
        System.out.println("Proyecto: " + nombre);
        System.out.println("Duración: " + duracionMin + " minutos");
        System.out.println("Tipo: " 
                + (duracionMin > 30 ? "Largometraje" : "Cortometraje"));
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre 
                + ", duracionMin=" + duracionMin + '}';
    }
}