package TP05.ejercicio03;

public class Editorial {
    
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void imprimirDatosEditorial() {
        System.out.println("Editorial: " + nombre);
        System.out.println("Dirección: " + direccion);
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre 
                + ", direccion=" + direccion + '}';
    }
}