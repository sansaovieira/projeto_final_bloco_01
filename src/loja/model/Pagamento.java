package loja.model;

public class Pagamento extends Produtos {

	private int tipoPagamento;

	public Pagamento(int codigo, int tipoPagamento, String modeloProduto, String cliente, float saldo,
			float valorTotal) {
		super(codigo, modeloProduto, cliente, saldo, valorTotal);
		this.tipoPagamento = tipoPagamento;
	}

	public int getTipoPagamento() {
		return tipoPagamento;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de Pagamento: " + (tipoPagamento == 1 ? "Crédito" : "Débito"));
	}
}
