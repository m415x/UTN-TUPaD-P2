package TP07.kata2;

public abstract class Figura {

    public String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

}
