package TP05.ejercicio05;

public class PlacaMadre {
    
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }

    public String getChipset() {
        return chipset;
    }

    public void imprimirEspecificaciones() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Chipset: " + chipset);
    }

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo 
                + ", chipset=" + chipset + '}';
    }
}