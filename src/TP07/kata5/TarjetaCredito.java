package TP07.kata5;

public class TarjetaCredito implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Pagado con Tarjeta de Crédito");
    }

}
