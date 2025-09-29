package TP06.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion,
            Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        int i = 0;
        Libro libroEncontrado = null;
        while (i < libros.size()
                && !this.libros.get(i).getIsbn().equalsIgnoreCase(isbn)) {
            i++;
        }
        if (i < libros.size()) {
            libroEncontrado = this.libros.get(i);
        }
        if (libroEncontrado == null) {
            System.out.println("isbn " + isbn + " no encontrado");
        }
        return libroEncontrado;
    }

    public Libro eliminarLibro(String isbn) {
        Libro eliminarLibro = buscarLibroPorIsbn(isbn);
        this.libros.remove(eliminarLibro);
        return eliminarLibro;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosEncontrados.add(libro);
            }
        }
        return Collections.unmodifiableList(librosEncontrados);
    }

    public void mostrarAutoresDisponibles() {
        List<Autor> autoresEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (!autoresEncontrados.contains(libro.getAutor())) {
                autoresEncontrados.add(libro.getAutor());
                System.out.println(libro.getAutor());
            }
        }
    }

}
