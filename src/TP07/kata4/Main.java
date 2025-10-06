package TP07.kata4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animales = new ArrayList();
        
        Perro pedro = new Perro("Pedro");
        Gato bastet = new Gato("Bastet");
        Vaca milka = new Vaca("Milka");
        
        animales.add(pedro);
        animales.add(bastet);
        animales.add(milka);
        
        for (Animal animal : animales) {
            System.out.println(animal.describirAnimal());
        }
    }

}
