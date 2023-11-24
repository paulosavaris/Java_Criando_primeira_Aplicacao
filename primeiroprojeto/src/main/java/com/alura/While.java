package com.alura;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliacao para o Filme ou -1 para nao inserir mais");
            nota = leitura.nextDouble();

            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }

        }
        System.out.println("Media de notas " + media / totalDeNotas);
        leitura.close();
    }
}
