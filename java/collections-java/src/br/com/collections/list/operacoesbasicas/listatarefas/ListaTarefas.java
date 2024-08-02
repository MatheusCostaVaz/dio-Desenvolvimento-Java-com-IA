package br.com.collections.list.operacoesbasicas.listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    //atributo
    private List<Tarefa> tarefaList;

    //ArrayList vazio
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    //remover de uma lista (tarefaList) todas as tarefas que possuem uma descrição específica (descricao) passada como argumento.
    public void removerTarefa(String descricao) {
        //Uma nova lista vazia chamada tarefasParaRemover é criada. Essa lista servirá para armazenar temporariamente as tarefas que serão removidas.
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        //O laço for-each percorre todos os elementos (t) da lista original de tarefas (tarefaList).
        for (Tarefa t : tarefaList) {

            //Para cada tarefa t, o método getDescricao() é usado para obter a descrição da tarefa.
            //equalsIgnoreCase(descricao) compara a descrição da tarefa com a descrição fornecida como argumento, ignorando diferenças entre maiúsculas e minúsculas.
            if (t.getDescricao().equalsIgnoreCase(descricao)) {

                //Se as descrições forem iguais (ignorando maiúsculas/minúsculas), a tarefa t é adicionada à lista auxiliar tarefasParaRemover.
                tarefasParaRemover.add(t);
            }
        }
        //Essa linha remove da lista original (tarefaList) todas as tarefas presentes na lista auxiliar (tarefasParaRemover).
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        System.out.println("O número total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }

}
