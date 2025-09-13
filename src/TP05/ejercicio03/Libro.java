package TP05.ejercicio03;

public class Libro {
    
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }
    
    public Editorial getEditorial() {
        return editorial;
    }

    public void imprimirInformacionLibro() {
        
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        if (autor != null) {
            System.out.println("Autor: " + autor.getNombre());
        }
        if (editorial != null) {
            System.out.println("Editorial: " + editorial.getNombre());
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + 
               ", autor=" + autor + ", editorial=" + editorial + '}';
    }
}