package model.entities;

import model.entities.enums.TipoCombustivel;

public class BombaCombustivel {

	private TipoCombustivel tipo;
	private Double valorPorLitro;
	private Double quantidadeComb;
	
	public BombaCombustivel() {
		
	}
	
	public BombaCombustivel(TipoCombustivel tipo, Double valorPorLitro, Double quantidadeComb) {
		this.tipo = tipo;
		this.valorPorLitro = valorPorLitro;
		this.quantidadeComb = quantidadeComb;
	}

	public TipoCombustivel getTipo() {
		return tipo;
	}

	public Double getValorPorLitro() {
		return valorPorLitro;
	}

	public Double getQuantidadeComb() {
		return quantidadeComb;
	}

	public double abastecerPorValor(Double quantidade) {
		Double litros = quantidade / valorPorLitro;
		alterarQuantidadeCombustivel(litros);
		return litros;
	}
	
	public double abastecerPorLitro(Double quantidade) {
		Double litros = quantidade;
		alterarQuantidadeCombustivel(litros);
		return quantidade * valorPorLitro;
	}
	
	public void alterarValor(Double novoValorLitro) {
		this.valorPorLitro = novoValorLitro;
	}
	
	public void alterarCombustivel(TipoCombustivel novoTipo) {
		this.tipo = novoTipo;
	}
	
	public void alterarQuantidadeCombustivel(Double quantidadeRetirada) {
		quantidadeComb -= quantidadeRetirada;
	}

	@Override
	public String toString() {
		return "Tipo de combustível: "
			+ tipo
			+ "\n"
			+ "Preço do litro: "
			+ String.format("R$ %.2f%n", valorPorLitro)
			+ "Quantidade de combustível restante na bomba: "
			+ String.format("%.2f litro(s)", quantidadeComb);
	}

	
	
	
}
