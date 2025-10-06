package TP07.kata4;

public class Perro extends Animal {

    public Perro(String name) {
        super(name);
    }

    @Override
    public String hacerSonido() {
        return "Guau Guau";
    }
    
}
