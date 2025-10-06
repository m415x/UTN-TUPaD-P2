package TP07.kata2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList();

        Circulo c1 = new Circulo("Circulo 1", 6);
        Circulo c2 = new Circulo("Circulo 2", 3);
        Rectangulo r1 = new Rectangulo("Rectangulo 1", 7, 12);
        Rectangulo r2 = new Rectangulo("Rectangulo 2", 4, 3);

        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2);

        for (Figura figura : figuras) {
            System.out.println("Área del "+ figura.nombre + ": " 
                    + String.format("%.2f", figura.calcularArea()) + " cm2");
        }
    }

}
