package TP05.ejercicio06;

public class Mesa {
    
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void imprimirDatosMesa() {
        System.out.println("Mesa N°: " + numero);
        System.out.println("Capacidad: " + capacidad + " personas");
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
}