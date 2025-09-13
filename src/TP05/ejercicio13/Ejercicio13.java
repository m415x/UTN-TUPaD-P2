package TP05.ejercicio13;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana Torres", "ana.torres@empresa.com");
        GeneradorQR generador = new GeneradorQR();
        
        System.out.println("=== GENERADOR DE CÓDIGOS QR ===");
        usuario.imprimirDatos();
        System.out.println("\n--- Generando código QR ---");
        generador.generar("https://www.elblog.com/perfil/ana-torres", usuario);
    }
}