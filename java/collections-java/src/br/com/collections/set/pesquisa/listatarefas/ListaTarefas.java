package br.com.collections.set.pesquisa.listatarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        System.out.println("\n");
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("Lista de tarefas vazia!");
        }
    }

    public void exibirTarefas() {
        System.out.println("\n");
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Lista de tarefas vazia!");

        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
            return tarefasConcluidas;
        } else {
            throw new RuntimeException("Lista de tarefas vazia!");
        }
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendente = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (!t.isConcluida()) {
                    tarefasPendente.add(t);
                }
            }
            return tarefasPendente;
        } else {
            throw new RuntimeException("Lista de tarefas vazia!");
        }
    }

    public void marcarTarefaConcluida(String descricao) {
        //Itera sobre todas as tarefas
        for (Tarefa t : tarefaSet) {
            //Compara a descrição da tarefa atual com a descrição fornecida (ignorando maiúsculas e minúsculas)
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true); //Marca a tarefa como concluida
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        //Inicializa a variável para armazenar a tarefa encontrada
        Tarefa tarefaMarcarPendente = null;
        //Itera sobre todas as tarefas
        for (Tarefa t : tarefaSet) {
            //Compara a descrição da tarefa atual com a descrição fornecida (ignorando maiúsculas e minúsculas)
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaMarcarPendente = t; //Se as descrições correspondem, armazena a tarefa na variável
                break;
            }
        }
        if (tarefaMarcarPendente != null) { //Verifica se a tarefa foi encontrada
            if (tarefaMarcarPendente.isConcluida()) { //Verifica se a tarefa está concluída
                tarefaMarcarPendente.setConcluida(false); //Marca a tarefa como pendente
            }
        } else {
            System.out.println("Tarefa não encontrada na lista!");
        }
    }

    public void limparListaTarefas() {
        if (tarefaSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }

}
