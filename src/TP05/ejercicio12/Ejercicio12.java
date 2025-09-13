package TP05.ejercicio12;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente(
                "María Elena García", "27-12345678-9");
        Impuesto impuesto = new Impuesto(12500.75);
        impuesto.setContribuyente(contribuyente);
        Calculadora calculadora = new Calculadora();
        
        impuesto.imprimirDetalles();
        calculadora.calcular(impuesto);
    }
}