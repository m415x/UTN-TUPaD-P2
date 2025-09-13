package TP05.ejercicio07;

public class Vehiculo {
   
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void imprimirInformacionVehiculo() {
        System.out.println("Patente: " + patente);
        System.out.println("Modelo: " + modelo);
        if (motor != null) {
            System.out.println("Motor: " + motor.getTipo());
        }
        if (conductor != null) {
            System.out.println("Conductor: " + conductor.getNombre());
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente 
                + ", modelo=" + modelo 
                + ", motor=" + motor 
                + ", conductor=" + conductor + '}';
    }
}