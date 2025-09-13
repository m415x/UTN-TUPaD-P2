package TP05.ejercicio12;

public class Impuesto {
    
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }
  
    public void imprimirContribuyente() {
        contribuyente.imprimirDatos();
    }

    public void imprimirDetalles() {
        System.out.println("=== DETALLES DEL IMPUESTO ===");
        System.out.println("Monto: $" + String.format("%,.2f", monto));
        if (contribuyente != null) {
            System.out.println("Contribuyente: " + contribuyente.getNombre());
            System.out.println("CUIL: " + contribuyente.getCuil());
        }
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto 
                + ", contribuyente=" + contribuyente + '}';
    }
}