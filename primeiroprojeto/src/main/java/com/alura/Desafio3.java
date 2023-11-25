package com.alura;

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
        String dadosCliente = """
                |***************************************************|
                |Dados iniciais do cliente:                         |
                |                                                   |
                |Nome:                       Jacqueline Oliveira    |
                |Tipo conta:                 Corrente               |
                |Saldo inicial:              R$ 5000,00             |
                |***************************************************|
                """;
        System.out.println(dadosCliente);
        String cervejaAsc = """
                ░░░░░░▄█▀█▄░░░░░░░░░░░░░░░
                ░▄█▀▀▀▀░░░░▀█▄▄▄▄▄▄▄░░░░░░
                █▀░░░░░░░░░░░░░░░░░▀█░░░░░
                ▀▄░▄░░░░░░░░░░░░░░░▄█░░░░░
                ░█████▄▄▄▄▄██▄▄▄█▀▀█░░░░░░
                ░█▀█░░░░▀░░░░░▀░░░░█▀▀▀▀▀█
                ░█░███▄▄▄▄░░░▄▄▄▄▄██▀▀██░█
                ░█░███░████▀████░███░░█░░█
                ░█▄███░████░████░███░░█░█▀
                ░░░███░████░████░███░░█░█░
                ░░░███░████░████░███▄▄█░█░
                ░░░███░████░████░███░░░▄█░
                ░░░███░████░████░███▀▀▀▀░░
                ░░▄███▄████░████▄███▄░░░░░
                ░░███▀███████████▀███░░░░░
                ░░░░▀▀▀██▄▄▄▄▄██▀▀▀░░░░░░░
                        """;
        Scanner leitura = new Scanner(System.in);
        double saldoInicial = 5000.00;
        int operacao = 0;
        double saldo = saldoInicial;
        while (operacao != 9) {
            String operation = """
                    |*************************|
                    |1 - Consultar saldos     |
                    |2 - Receber valor        |
                    |3 - Transferir valor     |
                    |4 - Mandar Joinha        |
                    |9 - Sair                 |
                    |*************************|
                    """;
            System.out.println(operation);
            System.out.println("Informe a operacao que deseja realizar");
            operacao = leitura.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println(String.format("Saldo atual é de: %.2f", saldo));
                    break;
                case 2:
                    System.out.println("Informe o valor a receber ");
                    double receber = leitura.nextDouble();
                    saldo += receber;
                    System.out.println("Saldo atual é de R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor a transferir ");
                    double transferir = leitura.nextDouble();
                    if (transferir > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldo -= transferir;
                        System.out.println(String.format("Transferencia de R$ %.2f realizada com sucesso", transferir));
                        System.out.println("Saldo atual é de R$ " + saldo);
                    }
                    break;
                case 4:
                    System.out.println(cervejaAsc);
                    break;
                case 9:
                    System.out.println("Operacao Encerrada, Ate mais");
                    break;
                default:
                    System.out.println("Opcao invalida! Escolha uma opcao valida.");
                    break;
            }

        }

    }

}
