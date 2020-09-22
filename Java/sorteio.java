package main;

import java.util.Scanner;
import java.util.Random;
//Emanuel D.M Informática III -  Sorteio

public class sorteio {

    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        Random gerador = new Random();
        int x = 0;
        int numeros[] = new int[60];
        do {
            System.out.print("Sortear números? (1 para sim, 0 para não): ");
            int op = aux.nextInt();
            if (op == 1) {
                for (int i = 1; i <= 60; i++) {
                    numeros[i - 1] = i;
                }
                int sorteio[] = new int[6];

                for (int j = 0; j <= 5; j++) {
                    boolean y = false;

                    do {
                        sorteio[j] = numeros[gerador.nextInt(59)];
                        for (Integer value : numeros) {
                            if (value == sorteio[j]) {
                                if (value == 0) {
                                    y = false;
                                } else {
                                    numeros[value - 1] = 0;
                                    y = true;
                                }
                            }
                        }
                    } while (y == false);
                }
                int cont = 1;
                for (Integer value : sorteio) {
                    System.out.println(cont + "º: " + value);
                    cont++;
                }
            }
        } while (x == 1);
    }
}
