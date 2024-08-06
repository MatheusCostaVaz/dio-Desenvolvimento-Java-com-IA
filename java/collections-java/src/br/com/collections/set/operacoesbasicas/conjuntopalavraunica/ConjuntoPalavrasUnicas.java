package br.com.collections.set.operacoesbasicas.conjuntopalavraunica;

import java.util.HashSet;
import java.util.Set;

/*o HashSet é uma estrutura de dados em Java que permite armazenar um conjunto de elementos únicos, 
ou seja, sem repetições. Ele utiliza uma tabela hash interna para organizar os elementos de forma eficiente, 
permitindo rápida inserção, remoção e busca.
Essa característica do HashSet é fundamental para o funcionamento do seu código, pois ele tem o objetivo de gerenciar um conjunto de palavras únicas, sem duplicatas.
 */
public class ConjuntoPalavrasUnicas {

    //Atributo para armazenar o conjunto de palavras únicas
    private Set<String> palavrasUnicasSet;

    //Construtor: Inicializa o conjunto vazio
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    //Método para adicionar uma palavra ao conjunto
    public void adicionarPalavra(String palavra) {
        //Adiciona a palavra, ignorando se já existir
        palavrasUnicasSet.add(palavra);
    }

    //Método para remover uma palavra do conjunto
    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) { //Verifica se o conjunto não está vazio
            if (palavrasUnicasSet.contains(palavra)) { //Verifica se a palavra existe
                palavrasUnicasSet.remove(palavra); //Remove a palavra
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    //Método para verificar se uma palavra existe no conjunto
    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    //Método para exibir todas as palavras únicas do conjunto
    public void exibirPalavrasUnicas() {
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
