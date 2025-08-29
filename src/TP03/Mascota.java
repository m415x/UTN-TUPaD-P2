package TP03;

public class Mascota {
    // Atributos de la clase
    String nombre;
    String especie;
    int edad;

    // Métodos de la clase
    public void mostrarInfo() {
        System.out.printf(
                "Mascota: %s\n"
                + "Especie: %s\n"
                + "Edad: %d\n\n",
                nombre, especie, edad
        );
    }

    public void cumplirAnios() {
        edad ++;
    }
}
