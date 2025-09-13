package TP05.ejercicio09;

public class Paciente {
    
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void imprimirDatosPaciente() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Obra Social: " + obraSocial);
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre 
                + ", obraSocial=" + obraSocial + '}';
    }
}