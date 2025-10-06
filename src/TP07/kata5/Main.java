package TP07.kata5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pagable> formas = new ArrayList();
        
        formas.add(new TarjetaCredito());
        formas.add(new Transferencia());
        formas.add(new Efectivo());
        
        for (Pagable forma : formas) {
            procesarPago(forma);
        }
    }

    public static void procesarPago(Pagable medio) {
        medio.pagar();
    }
}
