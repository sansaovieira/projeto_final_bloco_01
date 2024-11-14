package loja;

import java.util.Scanner;

import loja.utilitarios.Cores;

public class Menu {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;

		while (true) {
			System.out.println("************************************************************************");
			System.out.println("************************************************************************");
			System.out.println("                                                          ");
			System.out.println("                   🛍 LOJA DE CALÇADOS SLOW - LINHA NIKE                ");
			System.out.println("                                                     ");
			System.out.println("                         ➕ 1 - Cadastrar produtos                      ");
			System.out.println("                         📋 2 - Listar todas os produtos                ");
			System.out.println("                         🔎 3 - Buscar produto por número               ");
			System.out.println("                         ✏ 4 - Atualizar dados do produto              " + Cores.DEFAULT);
			System.out.println(Cores.RED + "                         🗑 5 - Apagar produto                          " + Cores.DEFAULT);
			System.out.println("                         🛒 6 - comprar                                 " + Cores.DEFAULT);
			System.out.println(Cores.RED + "                         ⬅ 7 - Sair                                    ");
			System.out.println("                                                     " + Cores.DEFAULT);
			System.out.println("*************************************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = scanner.nextInt();

			if (opcao == 7) {
				System.out.println("\nObrigado por visitar a nossa loja!!");
				sobre();
				break;
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar produtos\n\n");

				break;
			case 2:
				System.out.println("Listar todas os produtos\n\n");

				break;
			case 3:
				System.out.println("Consultar dados do produto por número\n\n");

				break;
			case 4:
				System.out.println("Atualizar dados do produto\n\n");

				break;
			case 5:
				System.out.println(Cores.RED + "Apagar produto\n\n" + Cores.DEFAULT);

				break;
			case 6:
				System.out.println("comprar\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
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

}
