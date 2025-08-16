package TP02;

import java.util.Scanner;

public class ContadorPositivosNegativosYCeros {

    public static void main(String[] args) {
        int num, contPos = 0, contNeg = 0, cont0 = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            num = scan.nextInt();

            if (num > 0) {
                contPos++;

            } else if (num < 0) {
                contNeg++;

            } else {
                cont0++;
            }
        }
        System.out.printf(
                "Resultados:\n"
                + "Positivos: %d\n"
                + "Negativos: %d\n"
                + "Ceros: %d\n",
                contPos, contNeg, cont0
        );
    }
}
