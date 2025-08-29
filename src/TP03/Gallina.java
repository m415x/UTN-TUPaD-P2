package TP03;

public class Gallina {
    // Atributos de la clase
    private static int contadorId = 0; // Atributo estático
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    // Método Constructor
    public Gallina(int edad, int huevosPuestos) {
        this.idGallina = ++contadorId;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    // Métodos de la clase
    public void ponerHuevo() {
        huevosPuestos++;
    }
    
    public void envejecer() {
        edad++;
    }
    
    public void mostrarEstado() {
        System.out.printf(
                "ID: %05d\n"
                + "Edad: %d\n"
                + "Huevos puestos: %d\n\n",
                idGallina, edad, huevosPuestos
        );
    }
}
