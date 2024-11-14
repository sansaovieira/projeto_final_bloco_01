package loja.model;

public abstract class Loja {

	private int numero;
	private int tipo;
	private String modelo;
	private String cliente;
	private float preco;
	private float saldo;

	

	public Loja(int numero, int tipo, String modelo, String cliente, float preco, float saldo) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.modelo = modelo;
		this.cliente = cliente;
		this.preco = preco;
		this.saldo = saldo;
	}

	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public boolean comprar(float valor) {

		if (this.getSaldo() < valor) {
			System.out.println("Saldo Insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;

	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Credito";
			break;
		case 2:
			tipo = "Debito";
			break;
		}

		System.out.println("\n\n**************************************************************************");
		System.out.println("Dados do produto:");
		System.out.println("\n**************************************************************************");
		System.out.println("                                                  ");
		System.out.println("Numero do calçado: " + this.numero);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Preço: " + preco);
		System.out.println("Cliente: " + this.cliente);
		System.out.println("Forma de pagamento: " + tipo);
		System.out.println("Saldo: " + this.saldo);
	}

}
