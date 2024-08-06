package br.com.collections.list.pesquisa.somanumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeroList) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }

}
