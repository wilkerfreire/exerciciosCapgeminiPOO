package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Person;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
	
	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your birthdate: ");
		LocalDate birthDate = LocalDate.parse(sc.next(), fmt);
		System.out.print("Enter your height: ");
		double height = sc.nextDouble();
		
		Person person1 = new Person(name, birthDate, height);
		System.out.println();
		System.out.println(person1);
		System.out.println("Your age: " + person1.ageCalculator());
		sc.close();
	}

}
