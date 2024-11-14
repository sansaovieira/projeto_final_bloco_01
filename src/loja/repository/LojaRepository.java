package loja.repository;

import loja.model.Produtos;

public interface LojaRepository {

	void procurarPorNumero(int numero);

	void listarTodos();

	void cadastrar(Produtos loja);

	void atualizar(Produtos loja);

	void deletar(int numero);

	void comprar(int numero, float valor);
}
