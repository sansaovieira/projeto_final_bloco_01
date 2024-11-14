package loja.model;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import loja.controller.LojaController;
import loja.utilitarios.Cores;

public class Menu {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		LojaController produto = new LojaController();

		int opcao, numero, tipoPagamento;
		String modeloProduto, cliente;
		float saldo, limite;

		while (true) {
			System.out.println("************************************************************************");
			System.out.println("************************************************************************");
			System.out.println("                                                          ");
			System.out.println("                   🛍 LOJA DE CALÇADOS SLOW - LINHA NIKE                ");
			System.out.println("                                                     ");
			System.out.println("                         ➕ 1 - Cadastrar produto                      ");
			System.out.println("                         📋 2 - Listar todos os produtos                ");
			System.out.println("                         🔎 3 - Buscar produto por número               ");
			System.out
					.println("                         ✏ 4 - Atualizar dados do produto              " + Cores.DEFAULT);
			System.out.println(Cores.RED + "                         🗑 5 - Apagar produto                          "
					+ Cores.DEFAULT);
			System.out.println(
					"                         🛒 6 - comprar                                 " + Cores.DEFAULT);
			System.out.println(Cores.RED + "                         ⬅ 7 - Sair                                    ");
			System.out.println("                                                     " + Cores.DEFAULT);
			System.out.println("*************************************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				scanner.nextLine();
				opcao = 0;
			}

			if (opcao == 7) {
				System.out.println("\nObrigado por visitar a nossa loja!!");
				sobre();
				break;
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.DEFAULT + "Cadastrar produto\n\n");

				System.out.println("Digite o número do tênis: ");
				numero = scanner.nextInt();
				System.out.println("Digite o nome do cliente: ");
				scanner.skip("\\R?");
				cliente = scanner.nextLine();

				System.out.println("Digite o modelo do produto: ");
				modeloProduto = scanner.nextLine();

				do {
					System.out.println("Digite o tipo da conta (1 - Crédito ou 2 - Débito): ");
					tipoPagamento = scanner.nextInt();
				} while (tipoPagamento < 1 || tipoPagamento > 2);

				System.out.println("Digite o saldo da conta (R$): ");
				saldo = scanner.nextFloat();

				if (tipoPagamento == 1) {
					System.out.println("Digite o limite de crédito (R$): ");
					limite = scanner.nextFloat();
					produto.cadastrar(new Pagamento(numero, tipoPagamento, modeloProduto, cliente, saldo, saldo));
				} else {
					produto.cadastrar(new Produtos(numero, modeloProduto, cliente, saldo, saldo));
				}

				System.out.println(Cores.GREEN + "\nProduto cadastrado com sucesso!" + Cores.DEFAULT);
				keyPress();
				break;

			case 2:
				System.out.println("Listar todos os produtos\n\n");
				produto.listarTodos();
				keyPress();
				break;
			
			case 3:
				System.out.println("Buscar produto por número\n\n");
				keyPress();
				break;
				
			case 4:
				System.out.println("Atualizar dados do produto\n\n");
				keyPress();
				break;

			case 5:
				System.out.println(Cores.RED + "Apagar produto\n\n" + Cores.DEFAULT);
				System.out.println("Digite o número do produto para apagar: ");
				numero = scanner.nextInt();
				produto.deletar(numero);
				keyPress();
				break;

			default:
				System.out.println(Cores.RED + "\nOpção Inválida!\n" + Cores.DEFAULT);
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*******************************************************");
		System.out.println("                                                          ");
		System.out.println("Projeto Desenvolvido por: Sansão Dembué Vieira ");
		System.out.println("Linkedin - https://www.linkedin.com/in/sansaovieira/");
		System.out.println("https://github.com/sansaovieira");
		System.out.println("                                                          ");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {
			System.out.println(Cores.DEFAULT + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
