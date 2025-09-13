package TP05.ejercicio08;

public class FirmaDigital {
    
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public void imprimirInformacionFirma() {
        System.out.println("Código Hash: " + codigoHash);
        System.out.println("Fecha: " + fecha);
        if (usuario != null) {
            System.out.println("Firmado por: " + usuario.getNombre());
        }
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash 
                + ", fecha=" + fecha
                + ", usuario=" + usuario + '}';
    }
}