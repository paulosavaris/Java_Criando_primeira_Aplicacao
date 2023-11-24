package com.alura;

public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lancamento que os clientes estao curtindo");
        } else {
            System.out.println("Filmes retros favoritos");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Alugar filme");
        }
        
    }

}
