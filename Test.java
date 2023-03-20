package br.com.arthur.ge.test;

import br.com.arthur.ge.modelo.Estoque;
import br.com.arthur.ge.modelo.Produto;
import br.com.arthur.ge.modelo.RelatorioEstoque;


public class Test {

	public static void main(String[] args) {
	    // Cria alguns produtos
	    Produto p1 = new Produto(1 ,"Camiseta", "Camiseta branca", 10.0, 20.0, 50);
	    Produto p2 = new Produto(2 ,"Calca", "Calca jeans", 50.0, 100.0, 20);
	    Produto p3 = new Produto(3 ,"Tenis", "Tenis esportivo", 80.0, 150.0, 30);

	    // Cria um estoque
	    Estoque estoque = new Estoque();
	    estoque.adicionarProduto(p1);
	    estoque.adicionarProduto(p2);
	    estoque.adicionarProduto(p3);

	    // Cria um relatorio de estoque e imprime o relatorio
	    RelatorioEstoque relatorio = new RelatorioEstoque(estoque);
	    relatorio.imprimirRelatorioEstoque();
	}
}
