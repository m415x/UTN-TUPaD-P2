package TP05.ejercicio11;

public class Cancion {
    
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void imprimirArtista() {
        artista.imprimirDatos();
    }
    
    public void imprimirInformacion() {
        System.out.println("=== INFORMACIÓN DE LA CANCIÓN ===");
        System.out.println("Título: " + titulo);
        if (artista != null) {
            System.out.println("Artista: " + artista.getNombre());
            System.out.println("Género: " + artista.getGenero());
        }
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo 
                + ", artista=" + artista + '}';
    }
}