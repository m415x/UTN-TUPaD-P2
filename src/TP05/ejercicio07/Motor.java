package TP05.ejercicio07;

public class Motor {
    
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void imprimirEspecificacionesMotor() {
        System.out.println("Tipo de Motor: " + tipo);
        System.out.println("Número de Serie: " + numeroSerie);
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo 
                + ", numeroSerie=" + numeroSerie + '}';
    }
}