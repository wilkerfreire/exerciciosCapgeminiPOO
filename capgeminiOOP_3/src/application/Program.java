package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.BombaCombustivel;
import model.entities.enums.TipoCombustivel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da bomba: ");
		System.out.print("Tipo de combustível(GASOLINA, ALCOOL OU DIESEL): ");
		TipoCombustivel tipo = TipoCombustivel.valueOf(sc.next().toUpperCase());
		System.out.print("Preço do litro: ");
		Double precoLitro = sc.nextDouble();
		System.out.print("Quantidade de combustível nela presente: ");
		Double quantComb = sc.nextDouble();
		BombaCombustivel bomba = new BombaCombustivel(tipo, precoLitro, quantComb);
		
		System.out.println();
		System.out.print("Abastecer por valor ou quantidade de litros?(v/q) ");
		char decisao = sc.next().charAt(0);
		if(decisao == 'v' || decisao == 'V') {
			System.out.print("Digite quantos reais você vai pagar: ");
			Double reais = sc.nextDouble();
			System.out.printf("Você irá abastecer %.2f litros %n", bomba.abastecerPorValor(reais));
		}
		else {
			System.out.print("Digite a quantidade de litros: ");
			Double litros = sc.nextDouble();
			System.out.printf("Você irá pagar R$ %.2f%n", bomba.abastecerPorLitro(litros));
		}
		System.out.println();
		System.out.println("Dados da bomba após abastecimento: ");
		System.out.println(bomba);
		
		sc.close();
	}

}
