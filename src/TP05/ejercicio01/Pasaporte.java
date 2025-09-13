package TP05.ejercicio01;

import java.time.LocalDate;

public class Pasaporte {

    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, LocalDate fechaEmision, String imagen,
            String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }
    
    public void imprimirInformacionBasica() {
        System.out.println("Pasaporte: " + numero 
                + " (Emitido: " + fechaEmision + ")");
    }

    public void imprimirInformacionCompleta() {
        System.out.println("Pasaporte N°: " + numero);
        System.out.println("Fecha Emisión: " + fechaEmision);
        if (titular != null) {
            titular.imprimirInformacionTitular();
        }
        foto.imprimirFoto();
    }
    
    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero 
                + ", fechaEmision=" + fechaEmision 
                + ", foto=" + foto 
                + ", titular=" + titular + '}';
    }
    
}
