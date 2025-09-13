package TP05.ejercicio08;

public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, String codigoHash, 
                    String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }
    
    public void imprimirFirmaDigital() {
        firmaDigital.imprimirInformacionFirma();
    }

    public void imprimirInformacionDocumento() {
        System.out.println("=== DOCUMENTO ===");
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " 
                + (contenido.length() > 50 ? contenido.substring(0, 50) 
                + "..." : contenido));
        if (firmaDigital != null) {
            System.out.println("Estado: Firmado digitalmente");
            System.out.println("Fecha de firma: " + firmaDigital.getFecha());
        } else {
            System.out.println("Estado: Pendiente de firma");
        }
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" 
                + (contenido.length() > 30 ? contenido.substring(0, 30) 
                + "..." : contenido) + ", firmaDigital=" + firmaDigital + '}';
    }
}