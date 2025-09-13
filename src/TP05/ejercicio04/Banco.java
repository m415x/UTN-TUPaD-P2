package TP05.ejercicio04;

public class Banco {
   
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void imprimirDatosBanco() {
        System.out.println("Banco: " + nombre);
        System.out.println("CUIT: " + cuit);
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
}