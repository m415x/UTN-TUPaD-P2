package TP05.ejercicio08;

public class Ejercicio08 {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
                "Dr. Carlos Mendoza", "carlos.mendoza@empresa.com");
        Documento documento = new Documento(
                "Contrato de Servicios", 
                "Este documento establece los términos y condiciones...",
                "a1b2c3d4e5f67890", "2024-03-20 15:30:00", usuario);
        
        documento.imprimirInformacionDocumento();
        System.out.println("\n--- Información de la firma digital ---");
        documento.imprimirFirmaDigital();
        System.out.println("\n--- Información del usuario ---");
        usuario.imprimirDatosUsuario();
    }
}