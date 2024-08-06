package br.com.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pesssoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pesssoasPorAltura, new ComparatorPorAltura());
            return pesssoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("nome 1", 20, 1.86);
        ordenacaoPessoas.adicionarPessoa("nome 2", 21, 1.36);
        ordenacaoPessoas.adicionarPessoa("nome 3", 33, 1.56);
        ordenacaoPessoas.adicionarPessoa("nome 4", 15, 1.46);
        ordenacaoPessoas.adicionarPessoa("nome 5", 99, 1.96);

        System.out.println(ordenacaoPessoas.pessoaList);
        System.out.println("--------------------");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println("--------------------");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }
}
