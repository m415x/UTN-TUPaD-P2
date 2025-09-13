package TP05.ejercicio10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void imprimirDatosTitular() {
        System.out.println("Titular: " + nombre);
        System.out.println("DNI: " + dni);
        if (cuentaBancaria != null) {
            System.out.println("CBU: " + cuentaBancaria.getCbu());
            System.out.println("Saldo: $" 
                    + String.format("%,.2f", cuentaBancaria.getSaldo()));
        } else {
            System.out.println("No tiene cuenta bancaria asignada");
        }
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + 
               ", cuentaBancaria=" + cuentaBancaria + '}';
    }
}