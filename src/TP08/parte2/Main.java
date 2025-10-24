package TP08.parte2;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Cristian Lahoz", 10000);

        try {
            cuenta.mostrarSaldo();
            cuenta.retirar(5000);
            cuenta.retirar(7000);
        } catch (SaldoInsuficienteException e) {
            cuenta.mostrarSaldo();
            System.err.println("Error: " + e.getMessage());
        } finally {
            cuenta.mostrarSaldo();
            System.out.println("Operación finalizada.");
        }
    }

}
