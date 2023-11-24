package com.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Filme: A volta dos que nao foram");

        // variavel com letra minuscula, Classe com Maiscula
        int ano = 2022;

        double notaFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        int classificacao = (int) (media / 2);// cast exp
        boolean incluidoNoPlano = true;

        System.out.println(classificacao);

        String sinopse;

        System.out.println("Ano de lancamento: " + ano);

        System.out.println(media);

        sinopse = "Filme aventura anos 80";

        System.out.println(String.format(
                "Filme: A volta dos que nao foram \nAno de lancamento: %d \nSinopse: %s", ano, sinopse));

        // desafio segunda trilha - conversao de temp
        System.out.println("Digite uma temperatura em graus Celsius");
        Scanner scanner = new Scanner(System.in);

        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(String.format("Temperatura em Fahrenheit é: %.2f graus", fahrenheit));
        // desafio segunda trilha - conversao de temp
        scanner.close();
    }
}