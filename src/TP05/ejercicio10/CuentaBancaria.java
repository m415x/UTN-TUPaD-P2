package TP05.ejercicio10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigoClave, 
                         String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(
                codigoClave, ultimaModificacion);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void imprimirClave() {
        claveSeguridad.imprimirInformacionClave();
    }

    public void imprimirInformacionCuenta() {
        System.out.println("CBU: " + cbu);
        System.out.println("Saldo: $" + String.format("%,.2f", saldo));
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre());
        }
        if (claveSeguridad != null) {
            System.out.println("Última modificación clave: " 
                    + claveSeguridad.getUltimaModificacion());
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo
                + ", claveSeguridad=" + claveSeguridad 
                + ", titular=" + titular + '}';
    }
}