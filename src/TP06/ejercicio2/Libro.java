package TP06.ejercicio2;

public class Libro {

    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anio, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anio;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    public void mostrarInfo() {
        System.out.println("Libro{" + "isbn=" + isbn 
                + ", titulo=" + titulo 
                + ", anioPublicacion=" + anioPublicacion 
                + ", autor=" + autor + '}');
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn 
                + ", titulo=" + titulo 
                + ", anioPublicacion=" + anioPublicacion 
                + ", autor=" + autor + '}';
    }
      
}
