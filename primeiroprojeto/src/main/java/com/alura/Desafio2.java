package com.alura;

import java.util.Random;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        int randon = new Random().nextInt(100);

        System.out.println(randon);
        System.out.println("Jogo de advinha, tente adivinhas o numero aleatiorio em ate 5 tentativas");
        Scanner numero = new Scanner(System.in);
        int i = 1;

        while (i <= 5) {

            System.out.println("Tentativa " + i + " de 5. Digite um número: ");
            int num = numero.nextInt();
            if (randon == num) {
                System.out.println("Parabéns! Você acertou o número era: " + randon);
                break; // Se acertar, sai do loop
            }

            i++;
        }
        if (i > 5) {
            System.out.println("Tentativas esgotadas. O número era: " + randon);
        }
        numero.close();
    }
}