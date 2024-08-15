package br.ufrn.imd.domain;

/**
 * Classe que representa um produto no estoque.
 */
public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;

    /**
     * Construtor para criar um novo produto.
     * @param codigo Código único do produto.
     * @param nome Nome do produto.
     * @param quantidade Quantidade em estoque.
     */
    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Quantidade: " + quantidade;
    }
}
