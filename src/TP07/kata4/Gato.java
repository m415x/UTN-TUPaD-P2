package TP07.kata4;

public class Gato extends Animal {

    public Gato(String name) {
        super(name);
    }

    @Override
    public String hacerSonido() {
        return "Miaaauuu";
    }

}
