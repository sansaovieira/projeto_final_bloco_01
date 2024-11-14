package loja.model;

public class Produtos {

	private int codigo;
	private String modeloProduto;
	private String cliente;
	private float saldo;
	private float valorTotal;

	public Produtos(int codigo, String modeloProduto, String cliente, float saldo, float valorTotal) {
		this.codigo = codigo;
		this.modeloProduto = modeloProduto;
		this.cliente = cliente;
		this.saldo = saldo;
		this.valorTotal = valorTotal;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getModeloProduto() {
		return modeloProduto;
	}

	public String getCliente() {
		return cliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void visualizar() {
		System.out.println("Código: " + codigo);
		System.out.println("Modelo: " + modeloProduto);
		System.out.println("Cliente: " + cliente);
		System.out.println("Saldo: R$ " + saldo);
		System.out.println("Valor Total: R$ " + valorTotal);
		System.out.println("----------------------------------------------------");
	}
}
