package application;

import java.util.Locale;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Funcionario func01 = new Funcionario("Flavio", "Augusto Silva", 4500.00);
		Funcionario func02 = new Funcionario("João", "Oliveira", 3700.00);
		
		System.out.println(func01);
		System.out.println(func02);
		System.out.println();
		System.out.println("Salário anual dos 2 funcionários abaixo.");
		System.out.println();
		func01.setSalarioMensal(func01.getSalarioMensal() * 12);
		func02.setSalarioMensal(func02.getSalarioMensal() * 12);
		System.out.println(func01);
		System.out.println(func02);
		System.out.println();
		System.out.println("Salário anual acrescido de 10% abaixo");
		System.out.println();
		func01.setSalarioMensal(func01.getSalarioMensal() * 1.1);
		func02.setSalarioMensal(func02.getSalarioMensal() * 1.1);
		System.out.println(func01);
		System.out.println(func02);
	}

}
