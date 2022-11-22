package entities;

public class Aluno {

	private Integer matricula;
	private String nome;
	private Double notaP1;
	private Double notaP2;
	private Double notaTrab;
	
	public Aluno() {
	}
	
	public Aluno(Integer matricula, String nome, Double notaP1, Double notaP2, Double notaTrab) {
		this.matricula = matricula;
		this.nome = nome;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaTrab = notaTrab;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNotaP1() {
		return notaP1;
	}

	public void setNotaP1(Double notaP1) {
		this.notaP1 = notaP1;
	}

	public Double getNotaP2() {
		return notaP2;
	}

	public void setNotaP2(Double notaP2) {
		this.notaP2 = notaP2;
	}

	public Double getNotaTrab() {
		return notaTrab;
	}

	public void setNotaTrab(Double notaTrab) {
		this.notaTrab = notaTrab;
	}
	
	public Double media() {
		return ((notaP1 * 2.5) + (notaP2 * 2.5) + (notaTrab * 2)) / 7;
	}
	
	public Double provaFinal() {
		if (media() < 7) {
			return 14 - media();
		}
		else {
			return 0.0;
		}
	}
}
