package TP05.ejercicio11;

public class Reproductor {
    
    public void reproducir(Cancion cancion) {
        if (cancion != null) {
            System.out.println("Reproduciendo: " + cancion.getTitulo());
            cancion.imprimirArtista();
        } else {
            System.out.println(
                    "Error: No se puede reproducir una canción nula");
        }
    }
}