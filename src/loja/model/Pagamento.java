package loja.model;

public class Pagamento extends Loja {

	private float limite;

	public Pagamento(int numero, int tipo, String modelo, String cliente, float preco, float saldo) {
		super(numero, tipo, modelo, cliente, preco, saldo);
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean comprar(float valor) {
		if (this.getTipo() == 1) {
			if (this.getSaldo() + this.getLimite() < valor) {
				System.out.println("\nNão tem saldo ou limite de crédito suficiente para efetuar a compra!");
				return false;
			}
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("\nCompra efetuada com sucesso no seu cartão de Credito!");
			return true;

		} else if (this.getTipo() == 2) {
			if (this.getSaldo() < valor) {
				System.out.println("\nSaldo insuficiente para efetuar a compra!");
				return false;
			}
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("\nCompra efetuada com sucesso no seu cartão de Debito!");
			return true;
		}
		return false;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}

}
