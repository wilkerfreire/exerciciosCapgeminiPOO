package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua matricula: ");
		int matricula = sc.nextInt();
		System.out.print("Digite seu nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Digite sua nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite sua nota 2: ");
		double nota2 = sc.nextDouble();
		System.out.print("Digite a nota do seu trabalho: ");
		double notaTrab = sc.nextDouble();
		
		Aluno aluno = new Aluno(matricula, nome, nota1, nota2, notaTrab);
		System.out.printf("Sua média foi: %.3f%n", aluno.media());

		if(aluno.provaFinal() == 0.0) {
			System.out.println("Aluno aprovado.");
		}
		else {
			System.out.printf("O aluno precisa de %.2f pontos na prova final para passar.", aluno.provaFinal());
		}
		
		sc.close();
	}

}
