package TP05.ejercicio05;

public class Propietario {
   
    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void imprimirDatosPropietario() {
        System.out.println("Propietario: " + nombre);
        System.out.println("DNI: " + dni);
        if (computadora != null) {
            System.out.println("Computadora: " + computadora.getMarca() + 
                             " (Serie: " + computadora.getNumeroSerie() + ")");
            System.out.println("Placa Madre: " 
                    + computadora.getPlacaMadre().getModelo());
        } else {
            System.out.println("No tiene computadora asignada");
        }
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre 
                + ", dni=" + dni 
                + ", computadora=" + computadora + '}';
    }
}