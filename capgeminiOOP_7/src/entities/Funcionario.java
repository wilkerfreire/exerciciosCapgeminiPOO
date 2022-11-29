package entities;

public class Funcionario {

	private String nome;
	private String sobrenome;
	private Double salarioMensal;
	
	public Funcionario(String nome, String sobrenome, Double salarioMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if(salarioMensal < 0) {
			this.salarioMensal = 0.0;
		} else {
			this.salarioMensal = salarioMensal;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(Double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.sobrenome + String.format(" -> R$ %.2f", this.salarioMensal);
	}
}
