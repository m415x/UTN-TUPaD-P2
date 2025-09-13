package TP05.ejercicio02;

public class Ejercicio02 {
    
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Li-ion", 5000);
        Usuario usuario = new Usuario("María García", "33445566");
        Celular celular = new Celular("123456789012345", "Samsung", 
                                    "Galaxy S23", bateria);
        celular.setUsuario(usuario);
        
        System.out.println("--- Información del celular ---");
        System.out.println(celular);
    }
}