package com.alura;

import java.util.Scanner;

public class Leitura {
        public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digit um filme");
        String filme = leitura.nextLine();

        System.out.println("Qual ano de lancamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual a nota?");
        double nota = leitura.nextDouble();

        System.out.println(
                String.format("Flme: %s \n ano de lancamento: %d \n nota: %.2f", filme, anoDeLancamento, nota));
        leitura.close();
    }
}
