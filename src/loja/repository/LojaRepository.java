package loja.repository;

import loja.model.Loja;

public interface LojaRepository {
	// CRUD da Conta
	public void procurarPorNumero(int numero);

	public void listarTodos();

	public void cadastrar(Loja loja);

	public void atualizar(Loja loja);

	public void deletar(int numero);

	// Métodos de pagamento
	public void comprar(int numero, float valor);

}
