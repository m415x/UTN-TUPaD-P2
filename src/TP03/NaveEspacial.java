package TP03;

public class NaveEspacial {
    // Atributos de la clase
    private String nombre;
    private int combustible = 0;
    private final int MAX_COMBUSTIBLE = 200; // capacidad máxima

    // Método Constructor
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    // Métodos de la clase
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado");
        } else {
            System.out.println(
                    "No hay suficiente combustible para despegar."
            );
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia / 1000; // 1 unidad cada 1000 km
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(
                    nombre + " avanzó " + distancia + " km."
                    + "\nConsumo: " + consumo
            );
        } else {
            System.out.println(
                    "No hay suficiente combustible para avanzar "
                    + distancia + " km."
            );
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        } else {
            int nuevoNivel = combustible + cantidad;
            if (nuevoNivel > MAX_COMBUSTIBLE) {
                combustible = MAX_COMBUSTIBLE;
                System.out.println(
                        "Se recargó hasta el máximo de " 
                        + MAX_COMBUSTIBLE + " unidades."
                );
            } else {
                combustible = nuevoNivel;
                System.out.println(""
                        + "Se recargaron " + cantidad 
                        + " unidades de combustible."
                );
            }
        }
    }

    public void mostrarEstado() {
        System.out.println(
                "Nave: " + nombre 
                + "\nCombustible: " + combustible + "/" + MAX_COMBUSTIBLE + "\n"
        );
    }
}
