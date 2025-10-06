package TP07.kata4;

public abstract class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String hacerSonido();

    public String describirAnimal() {
        return name + " hace " + hacerSonido();
    };

}
