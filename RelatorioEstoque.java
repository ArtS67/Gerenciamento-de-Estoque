package br.com.arthur.ge.modelo;

import java.text.DecimalFormat;




/**
 * Classe responsavel por gerar o relatorio que sera exibido
 * 
 * @author arthur simoes
 * @version 0.1
 */
public class RelatorioEstoque {
    private Estoque estoque;

    public RelatorioEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0.0;
        for (Produto produto : estoque.getProdutos()) {
            valorTotal += produto.getPrecoVenda() * produto.getQuantidade();
        }
        return valorTotal;
    }

    public void imprimirRelatorioEstoque() {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("=== RELATORIO DE ESTOQUE ===\n");
        System.out.println("Quantidade de produtos em estoque: " + estoque.getProdutos().size());
        System.out.println("Valor total em estoque: R$" + df.format(calcularValorTotalEstoque()) + "\n");

        for (Produto produto : estoque.getProdutos()) {
        	System.out.println("Codigo: " + produto.getCodigo());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descricao: " + produto.getDescricao());
            System.out.println("Preco de compra: R$" + df.format(produto.getPrecoCompra()));
            System.out.println("Preco de venda: R$" + df.format(produto.getPrecoVenda()));
            System.out.println("Quantidade em estoque: " + produto.getQuantidade() + "\n");
        }
    }
}
