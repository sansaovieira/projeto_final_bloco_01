package loja.controller;

import java.util.ArrayList;
import loja.model.Produtos;
import loja.repository.LojaRepository;
import loja.utilitarios.Cores;

public class LojaController implements LojaRepository {

	private ArrayList<Produtos> listaProdutos = new ArrayList<>();
	private int codigo = 0;

	@Override
	public void procurarPorNumero(int numero) {
		for (Produtos produto : listaProdutos) {
			if (produto.getCodigo() == numero) {
				produto.visualizar();
				return;
			}
		}
		System.out.println("Produto não encontrado!");
	}

	@Override
	public void listarTodos() {
		if (listaProdutos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
		} else {
			for (Produtos produto : listaProdutos) {
				produto.visualizar();
			}
		}
	}

	@Override
	public void cadastrar(Produtos loja) {
		loja.setCodigo(gerarNumero());
		listaProdutos.add(loja);
	}

	@Override
	public void atualizar(Produtos loja) {

	}

	@Override
	public void deletar(int numero) {
		Produtos produtoRemover = null;
		for (Produtos produto : listaProdutos) {
			if (produto.getCodigo() == numero) {
				produtoRemover = produto;
				break;
			}
		}
		if (produtoRemover != null) {
			listaProdutos.remove(produtoRemover);
			System.out.println(Cores.GREEN
					+ "Produto apagado com sucesso!");
		} else {
			System.out.println("Produto não encontrado para remoção.");
		}
	}

	@Override
	public void comprar(int numero, float valor) {
	}

	private int gerarNumero() {
		return ++codigo;
	}
}
