package model.entities;

public class ContaCorrente {

	private Integer numero;
	private String nome;
	private Double saldo;
	
	public ContaCorrente(Integer numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		saldo = 0.0;
	}
	
	public ContaCorrente(Integer numero, String nome, Double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void alterarNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void deposito(Double quantia) {
		saldo += quantia;
	}
	
	public void saque(Double quantia) {
		saldo -= quantia;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\n"
			+ "Numero da conta: " + numero + "\n"
			+ "Saldo: " + String.format("%.2f", saldo);
	}
	
}
