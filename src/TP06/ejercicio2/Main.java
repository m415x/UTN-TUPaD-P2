package TP06.ejercicio2;

public class Main {

    public static void main(String[] args) {
        // Creamos autores
        Autor autor1 = new Autor("01", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("02", "J.K. Rowling", "Británica");
        Autor autor3 = new Autor("03", "Michael Crichton", "Estadounidense");
        Autor autor4 = new Autor("04", "J.R.R. Tolkien", "Británico");

        // Creamos biblioteca
        Biblioteca biblioteca = new Biblioteca("Popular");
        
        // Agregamos libros a la biblioteca
        biblioteca.agregarLibro("9788422614166", "Cronica de una muerte anunciada", 1982, autor1);
        biblioteca.agregarLibro("9788478884452", "Harry Potter y la piedra filosofal", 1997, autor2);
        biblioteca.agregarLibro("9780345325815", "El Silmarillion", 1985, autor4);
        biblioteca.agregarLibro("9780345538987", "Jurassic Park", 1990, autor3);
        biblioteca.agregarLibro("9788472230088", "Relato de un naufrago", 1988, autor1);

        // Listamos todos los libros
        System.out.println("Listado de libros en la biblioteca:");
        biblioteca.listarLibros();
        
        // Buscamos libros por ISBN
        System.out.println("\nResultado de buscar libro por ISBN:");
        System.out.println(biblioteca.buscarLibroPorIsbn("9780345538987"));
        System.out.println(biblioteca.buscarLibroPorIsbn("9780345538988"));
        
        // Filtramos por año
        System.out.println("\nResultado de filtrar libro por año:");
        System.out.println(biblioteca.filtrarLibrosPorAnio(1985));
        
        // Eliminamos libro por ISBN y mostramos libros restantes
        System.out.println("\nEliminamos un libro y mostramos los que quedan:");
        biblioteca.eliminarLibro("9788422614166");
        biblioteca.listarLibros();
        
        // Mostramos la cantidad total de libros en la biblioteca
        System.out.println("\nCantidad total de libros en la biblioteca: " 
                + biblioteca.obtenerCantidadLibros());
        
        // Listamos todos los autores de los libros disponibles en la biblioteca
        System.out.println("\nSe encontraron los siguientes autores:");
        biblioteca.mostrarAutoresDisponibles();
    }

}
