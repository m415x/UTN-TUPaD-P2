package TP03;

public class Libro {
    // Atributos privados de la clase
    private String titulo = "POO en Java";
    private String autor = "UTN";
    private int anioPublicacion;
    
    // Getters de la clase
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    // Setter de la clase
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.printf(
                    "El valor '%d' no es un año válido\n", anioPublicacion
            );
        }
    }
}
