package TP05.ejercicio04;

public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, 
                           Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public String getNumero() {
        return numero;
    }

    public void imprimirDatosTarjeta() {
        System.out.println("Número: " + numero);
        System.out.println("Vencimiento: " + fechaVencimiento);
        if (cliente != null) {
            System.out.println("Titular: " + cliente.getNombre());
        }
        if (banco != null) {
            System.out.println("Banco: " + banco.getNombre());
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero
               + ", fechaVencimiento=" + fechaVencimiento
               + ", cliente=" + cliente + ", banco=" + banco + '}';
    }
}