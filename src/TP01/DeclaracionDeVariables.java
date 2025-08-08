package TP01;

public class DeclaracionDeVariables {

    public static void main(String[] args) {
        String nombre = "Cristian Lahoz";
        int edad = 39;
        double altura = 1.75;
        boolean estudiante = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " mts");
        System.out.println("Es estudiante: " + ((estudiante) ? "Si" : "No"));
    }

}
