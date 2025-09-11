package TP04.adicionales;

public class Libro {
    
    private static String editorial = "Independiente";
    
    private String titulo;
    private String autor ;

    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        Libro.editorial = editorial;
    }
    
    public Libro(String titulo, String autor) {
        this(titulo, autor, Libro.editorial);
    }
    
    public static String getEditorial() {
        return editorial;
    }

    public static void setEditorial(String editorial) {
        Libro.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setTitulo(String prefijo, String titulo) {
        this.titulo = prefijo + " " + titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo + ", " + autor + "\nEditorial " + Libro.editorial + "\n";
    }
}
