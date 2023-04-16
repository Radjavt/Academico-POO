package br.edu.ifs.academico;

public class Aluno extends Pessoa {

	public Aluno(String nome) {
		super(nome);
	}

	@Override
	public String toString() {
		return "\n Nota 1: " + nota1 + "\n Nota 2: " + nota2 + "\n Nota 3: " + nota3 + "\n Bolsa do Aluno: " + bolsaAluno
				+ "\n Dados do Cadastro: " + super.toString();
	}

	private double nota1;
	private double nota2;
	private double nota3;
	private double bolsaAluno;
	
	public double calcularDecimoTerceiro() {
		bolsaAluno = 0.5 * bolsaAluno;
		double resultado = bolsaAluno;
		return resultado;
	}

	public double getBolsaAluno() {
		return bolsaAluno;
	}

	public void setBolsaAluno(double bolsaAluno) {
		this.bolsaAluno = bolsaAluno;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

}
