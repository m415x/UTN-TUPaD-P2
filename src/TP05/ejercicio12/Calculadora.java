package TP05.ejercicio12;

public class Calculadora {
    
    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            System.out.println("\nCALCULADORA FISCAL");
            System.out.println("======================");
            
            double montoBase = impuesto.getMonto();
            double iva = montoBase * 0.21;
            double iibb = montoBase * 0.035;
            double total = montoBase + iva + iibb;
            
            impuesto.imprimirContribuyente();
            System.out.println("Monto base: $" 
                    + String.format("%,.2f", montoBase));
            System.out.println("IVA (21%): $" 
                    + String.format("%,.2f", iva));
            System.out.println("IIBB (3.5%): $" 
                    + String.format("%,.2f", iibb));
            System.out.println("TOTAL: $" 
                    + String.format("%,.2f", total));
            System.out.println("Fecha de cálculo: " 
                    + java.time.LocalDate.now());
        } else {
            System.out.println("Error: No se puede calcular un impuesto nulo");
        }
    }
}