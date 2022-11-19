package model.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String name;
	private LocalDate birthDate;
	private Double height;
	
	public Person() {
	}
	
	public Person(String name, LocalDate birthDate, Double height) {
		this.name = name;
		this.birthDate = birthDate;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	public int ageCalculator() {
		LocalDate currentDate = LocalDate.now();
		return Period.between(birthDate, currentDate).getYears();
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\n"
			+ "Birthdate: " + fmt.format(birthDate) + "\n"
			+ "Height: " + String.format("%.2f", height);
	}
	
}
