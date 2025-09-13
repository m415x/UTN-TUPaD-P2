package TP05.ejercicio07;

public class Conductor {
    
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void imprimirDatosConductor() {
        System.out.println("Conductor: " + nombre);
        System.out.println("Licencia: " + licencia);
        if (vehiculo != null) {
            System.out.println("Vehículo asignado: " + vehiculo.getModelo() 
                    + " (Patente: " + vehiculo.getPatente() + ")");
        } else {
            System.out.println("No tiene vehículo asignado");
        }
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre 
                + ", licencia=" + licencia 
                + ", vehiculo=" + vehiculo + '}';
    }
}