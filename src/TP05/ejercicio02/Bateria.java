package TP05.ejercicio02;

public class Bateria {
   
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public void imprimirInformacionBateria() {
        System.out.println("Batería: " + modelo + " - " + capacidad + " mAh");
    }

    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo 
                + ", capacidad=" + capacidad + '}';
    }

}