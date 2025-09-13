package TP05.ejercicio13;

public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) {
        if (valor != null && usuario != null) {
            // Creación del código QR (dependencia de creación)
            CodigoQR codigo = new CodigoQR(valor);
            codigo.setUsuario(usuario);
            
            System.out.println("Código QR generado exitosamente!");
            System.out.println("Contenido: " + codigo.getValor());
            codigo.imprimirUsuario();
        } else {
            System.out.println("Error: No se puede generar QR con datos nulos");
        }
    }
}