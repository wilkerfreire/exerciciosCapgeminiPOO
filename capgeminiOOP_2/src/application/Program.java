package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o seu nome? ");
		String nome = sc.nextLine();
		System.out.print("Informe o número da sua conta: ");
		int numero = sc.nextInt();
		System.out.print("Voce vai querer fazer um depósito inicial?(s/n): ");
		char decisao = sc.next().charAt(0);
		ContaCorrente conta;
		
		if(decisao == 's' || decisao == 'S') {
			System.out.print("Informe o valor do depósito inicial: ");
			Double depositoInicial = sc.nextDouble();
		    conta = new ContaCorrente(numero, nome, depositoInicial);
		}
		else {
		    conta = new ContaCorrente(numero, nome);
		}
		System.out.println();
		System.out.println("Dados da sua conta");
		System.out.println(conta);
		
		System.out.println("Você quer fazer um deposito ou um saque? (d/s): ");
		char decisao2 = sc.next().charAt(0);
		
		if(decisao2 == 'd' || decisao2 == 'D') {
			System.out.print("Digite a quantia de deposito: ");
			Double deposito = sc.nextDouble();
			conta.deposito(deposito);
		}
		else {
			System.out.print("Digite a quantia de saque: ");
			Double saque = sc.nextDouble();
			conta.saque(saque);
		}
		System.out.println();
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);
		
		sc.close();
	}

}
