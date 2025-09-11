package TP04.adicionales;

public class Cuenta {
    
    private static int ultimoNumero = 100;
    private static int totalCuentas = 0;
    
    private int numero; 
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = ++Cuenta.ultimoNumero;
        Cuenta.totalCuentas++;
    }
    
    public Cuenta(String titular) {
        this(titular, 0);
    }
    
    public double consultarSaldo() {
        return this.saldo;
    }
    
    public double consultarSaldo(double cotizacionDolar) {
        return this.saldo / cotizacionDolar;
    }
    
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Monto depositado: $" + monto);
        }
    }
    
    public void extraer(double monto) {
        if (monto > 0 && saldo >= monto) {
            this.saldo -= monto;
            System.out.println("Monto extraído: $" + monto);
        }
    }
    
    public static int mostrarTotalCuentas() {
        return Cuenta.totalCuentas;
    }

    @Override
    public String toString() {
        return "Cuenta: #" + numero 
                + "\nTitular: " + titular 
                + "\nSaldo: $" + String.format("%.2f", saldo) + "\n";
    }
}
