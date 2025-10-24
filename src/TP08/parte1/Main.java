package TP08.parte1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vendible> items = new ArrayList<>();
        items.add(new Producto("Monitor", 150000, 10));
        items.add(new Producto("Teclado", 25000, 5));
        items.add(new Servicio("Instalación de software", 5000, 2));
        items.add(new Servicio("Mantenimiento técnico", 8000, 3));

        System.out.println("Listado de items:");
        for (Vendible v : items) {
            System.out.println(v);
        }
    }

}
