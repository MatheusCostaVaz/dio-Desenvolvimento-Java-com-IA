package SimulacaoBancaria;

import java.util.Scanner;

public class SimulacaoBancariaBsc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    saldo = scanner.nextDouble();
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    double saldoSacado = scanner.nextDouble();
                    if (saldoSacado > saldo) {
                        System.out.printf("Saldo insuficiente.\n");
                    } else {
                        saldo -= saldoSacado;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);

                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
        scanner.close();
    }
}
