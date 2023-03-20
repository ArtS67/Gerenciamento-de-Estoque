package br.com.arthur.ge.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsavel pela gestao do estoque
 * 
 * @author arthur simoes
 * @version 0.1
 */
public class Estoque {
	private List<Produto> produtos = new ArrayList<>();

	/**
	 * 
	 * @param produto
	 */
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}

	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}

	public void atualizarProduto(Produto produto) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getNome().equals(produto.getNome())) {
				produtos.set(i, produto);
				break;
			}
		}
	}

	public Produto consultarProdutoPorNome(String nome) {
		for (Produto produto : produtos) {
			if (produto.getNome().equals(nome)) {
				return produto;
			}
		}
		return null;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
}
