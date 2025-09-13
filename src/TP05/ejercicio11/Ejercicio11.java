package TP05.ejercicio11;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        Artista artista = new Artista("The Weeknd", "R&B/Pop");
        Cancion cancion = new Cancion("Blinding Lights");
        cancion.setArtista(artista);
        Reproductor reproductor = new Reproductor();
        
        cancion.imprimirInformacion();
        System.out.println("\n--- Reproduciendo canción ---");
        reproductor.reproducir(cancion);
    }
}