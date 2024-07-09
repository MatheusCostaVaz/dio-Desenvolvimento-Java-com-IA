package SimulacaoBancaria;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("1. Depositar \n2. Sacar \n3. Consultar Saldo\n0. Encerrar\nDigite o número para escolher a opção:\n");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("\nSaldo atual: %.2f", saldo);
                    System.out.println("\nQuanto você quer depositar: ");
                    double saldoDepositado = scanner.nextDouble();
                    saldo += saldoDepositado;
                    System.out.printf("Saldo atualizado: %.2f\n\n", saldo);
                    break;
                case 2:
                    System.out.printf("\nSaldo atual: %.2f", saldo);
                    System.out.println("\nQuanto você quer sacar: ");
                    double saldoSacado = scanner.nextDouble();
                    if (saldoSacado > saldo) {
                        System.out.printf("\nSaldo insuficiente\nVocê pode sacar no máximo: %.2f\n", saldo);
                    } else {
                        saldo -= saldoSacado;
                        System.out.printf("\nSaldo atual: %.2f\n\n", saldo);
                    }
                    break;
                case 3:
                    System.out.printf("\nSaldo atual: %.2f", saldo);

                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
