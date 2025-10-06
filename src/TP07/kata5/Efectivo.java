package TP07.kata5;

public class Efectivo implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Pagado con Efectivo");
    }

}
