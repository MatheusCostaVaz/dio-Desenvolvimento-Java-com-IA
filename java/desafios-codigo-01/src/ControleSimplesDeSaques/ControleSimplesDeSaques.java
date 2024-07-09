package ControleSimplesDeSaques;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario; // Variável para controlar o limite restante

        // Loop for para iterar sobre os saques
        for (int i = 1;; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteRestante) { // Compara com o limite restante
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                limiteRestante -= valorSaque; // Atualiza o limite restante
                System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteRestante);
            }
        }

        scanner.close();
    }
}
