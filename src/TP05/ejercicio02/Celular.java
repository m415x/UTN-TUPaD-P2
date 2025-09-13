package TP05.ejercicio02;

public class Celular {
    
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, 
                  Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void imprimirInformacionCelular() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("IMEI: " + imei);
    }
    
    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + 
               ", modelo=" + modelo + ", " + bateria + 
               ", " + usuario + '}';
    }
}