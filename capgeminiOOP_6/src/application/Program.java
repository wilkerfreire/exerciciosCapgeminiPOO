package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Invoice;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o seu nome ? ");
		String nome = sc.nextLine();
		System.out.println("Olá " + nome + ", faça o que for pedido abaixo");
		System.out.print("Número do item: ");
		int numeroItem = sc.nextInt();
		System.out.print("Digite a descrição do item: ");
		sc.nextLine();
		String descrItem = sc.nextLine();
		System.out.print("Digite a quantidade comprada: ");
		int qtdCompradaItem = sc.nextInt();
		System.out.print("Digite o preço unitário do item: ");
		double precoUnit = sc.nextDouble();
		Invoice invoice = new Invoice(numeroItem, descrItem, qtdCompradaItem, precoUnit);
		System.out.println();
		System.out.println("Processando...");
		System.out.println();
		System.out.println(invoice);
		
		sc.close();
	}

}
