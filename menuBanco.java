package olamundo;

import java.util.Scanner;

public class menuBanco {
	public static void main(String[] args) {
		Scanner soma = new Scanner(System.in);
		int opcao = 0;

		String nome = "Gabriel Martinelli";
		String tipoConta = "Corrente";
		double saldoBancario = 2500;

		int opçaoEscolhida = 0;

		System.out.println("Dados iniciais do cliente: \n" );		
		System.out.println("Nome do Cliente: " + nome);
		System.out.println("Tipo de conta: " + tipoConta);
		System.out.println("Saldo da conta: " + saldoBancario + "\n");
				String menu = """
				** Digite sua opção **
				1 - Consultar saldo
				2 - Receber valor
				3 - Transferir valor 
				4 - Sair
				""";
		while ( opçaoEscolhida != 4 ) {
			System.out.println(menu);			
			System.out.println("Digite qual opção você deseja: ");
			opçaoEscolhida = soma.nextInt();
			switch(opçaoEscolhida) {
			case 1: 
				System.out.println(saldoBancario);
				break;
			case 2:
				System.out.println("Qual o valor que será depositado: ");
				double somaBancaria = soma.nextDouble();
				saldoBancario += somaBancaria;
				System.out.println("Seu novo saldo bancário: " + saldoBancario);
				break;
			case 3:
				System.out.println("Qual o valor que você irá retirar?");
				double menos = soma.nextDouble();
				if(saldoBancario - menos > 0) {
					saldoBancario = saldoBancario - menos;
					System.out.println("Seu novo saldo bancário :" + saldoBancario);
				}else {
					System.out.println("Você não tem saldo disponível. ");
				}
				break;
			case 4:
				System.out.println("Volte sempre!");
				break;

			}
		}
	}
}
