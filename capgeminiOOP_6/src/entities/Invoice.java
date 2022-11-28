package entities;

public class Invoice {

	private Integer numeroItem;
	private String descrItem;
	private Integer qtdCompradaItem;
	private Double precoUnit;
	
	public Invoice() {
	}
	
	public Invoice(Integer numeroItem, String descrItem,Integer qtdCompradaItem, Double precoUnit) {
		this.numeroItem = numeroItem;
		this.descrItem = descrItem;
		if(qtdCompradaItem < 0) {
			this.qtdCompradaItem = 0;
		} else {
			this.qtdCompradaItem = qtdCompradaItem;
		}
		if(precoUnit < 0) {
			this.precoUnit = 0.0;
		} else {
			this.precoUnit = precoUnit;
		}
	}

	public Integer getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(Integer numeroItem) {
		this.numeroItem = numeroItem;
	}

	public String getDescrItem() {
		return descrItem;
	}

	public void setDescrItem(String descrItem) {
		this.descrItem = descrItem;
	}

	public Integer getQtdCompradaItem() {
		return qtdCompradaItem;
	}

	public void setQtdCompradaItem(Integer qtdCompradaItem) {
		this.qtdCompradaItem = qtdCompradaItem;
	}

	public Double getPrecoUnit() {
		return precoUnit;
	}

	public void setPrecoUnit(Double precoUnit) {
		this.precoUnit = precoUnit;
	}
	
	public double getInvoiceAmount() {
		return this.precoUnit * this.qtdCompradaItem;
	}
	
	@Override
	public String toString() {
		return "Número do item: " + this.numeroItem + "\n"
			+ "Descrição do item: " + this.descrItem + "\n"
			+ "Quantidade comprada: " + this.qtdCompradaItem + "\n"
			+ "Preço unitário do item: " + this.precoUnit + "\n"
			+ String.format("Total da fatura: R$ %.2f", getInvoiceAmount());
	}
}
