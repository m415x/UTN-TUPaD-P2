package TP08.parte2;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito exitoso: $" + monto);
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar $" + monto);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso: $" + monto);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + String.format("%.2f", saldo));
    }

}
