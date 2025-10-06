package TP07.kata1;

public class Main {

    public static void main(String[] args) {
        Auto a1 = new Auto("Toyota Corola", "2020", 4);
        Auto a2 = new Auto("Peugeot 3008", "2018", 5);
        Auto a3 = new Auto("Fiat Palio", "2010", 5);

        a1.mostrarInfo();
        a2.mostrarInfo();
        a3.mostrarInfo();
    }

}
