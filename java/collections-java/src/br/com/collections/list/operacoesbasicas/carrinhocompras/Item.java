package br.com.collections.list.operacoesbasicas.carrinhocompras;

public class Item {

    public String nome;
    public double preco;
    public int qtd;

    public Item(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    @Override
    public String toString() {
        return "Item{"
                + "nome='" + nome + '\''
                + ", preco=" + preco
                + ", quant=" + qtd
                + '}';
    }

}
