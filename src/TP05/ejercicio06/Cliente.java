package TP05.ejercicio06;

public class Cliente {
    
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void imprimirDatosCliente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre 
                + ", telefono=" + telefono + '}';
    }
}