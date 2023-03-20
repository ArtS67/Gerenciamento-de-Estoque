package br.com.arthur.ge.modelo;




/**
 * Classe responsavel por gerar os produtos que serao contabilizados
 * 
 * @author arthur simoes
 * @version 0.1
 */
public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private int quantidade;

    
    /**
     * 
     * @param codigo
     * @param nome
     * @param descricao
     * @param precoCompra
     * @param precoVenda
     * @param quantidade
     */
    public Produto(int codigo, String nome, String descricao, double precoCompra, double precoVenda, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
