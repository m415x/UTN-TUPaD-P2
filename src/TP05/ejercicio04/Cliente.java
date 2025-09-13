package TP05.ejercicio04;

public class Cliente {
    
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void imprimirDatosCliente() {
        System.out.println("Cliente: " + nombre);
        System.out.println("DNI: " + dni);
        if (tarjeta != null) {
            System.out.println("Tarjeta: " 
                    + tarjeta.getNumero().substring(0, 4) 
                    + " **** **** ****");
            System.out.println("Banco: " + tarjeta.getBanco().getNombre());
        } else {
            System.out.println("No tiene tarjeta asignada");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre 
                + ", dni=" + dni
                + ", tarjeta=" + tarjeta + '}';
    }
}