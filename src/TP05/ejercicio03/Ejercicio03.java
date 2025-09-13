package TP05.ejercicio03;

public class Ejercicio03 {
    
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");
        Editorial editorial = new Editorial("Sudamericana", 
                "Buenos Aires, Argentina");
        Libro libro = new Libro("Crónica de una muerte anunciada", 
                "978-81101911013", editorial);
        libro.setAutor(autor);
        
        System.out.println("--- Información del libro ---");
        libro.imprimirInformacionLibro();
        System.out.println("\n--- Información del autor ---");
        autor.imprimirDatosAutor();
        System.out.println("\n--- Información de la editorial ---");
        editorial.imprimirDatosEditorial();
    }
}