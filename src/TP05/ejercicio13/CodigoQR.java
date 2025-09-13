package TP05.ejercicio13;

public class CodigoQR {
    
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public void imprimirUsuario() {
        System.out.println("Autor: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
    }
    
    public void imprimirQR() {
        System.out.println("=== CÓDIGO QR ===");
        System.out.println("Valor: " + valor);
        if (usuario != null) {
            System.out.println("Usuario asociado: " + usuario.getNombre());
            System.out.println("Email: " + usuario.getEmail());
        }
        System.out.println("Fecha creación: " + java.time.LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }
}