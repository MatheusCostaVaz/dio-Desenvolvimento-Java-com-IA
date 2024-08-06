package br.com.collections.list.pesquisa.catalogolivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        } else {
            System.out.println("Lista de livro vazia.");
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloAnos.add(l);
                }
            }
        } else {
            System.out.println("Ano não encontrado");
        }
        return livroPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2023);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
        System.out.println("----------------------------------");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2013, 2024));
        System.out.println("----------------------------------");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));
        System.out.println("----------------------------------");

    }
}
