package TP05.ejercicio05;

public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPlaca, 
                      String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void imprimirDatosComputadora() {
        System.out.println("Marca: " + marca);
        System.out.println("Número de Serie: " + numeroSerie);
        if (placaMadre != null) {
            System.out.println("Placa Madre: " + placaMadre.getModelo());
        }
        if (propietario != null) {
            System.out.println("Propietario: " + propietario.getNombre());
        }
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca 
                + ", numeroSerie=" + numeroSerie 
                + ", placaMadre=" + placaMadre 
                + ", propietario=" + propietario + '}';
    }
}