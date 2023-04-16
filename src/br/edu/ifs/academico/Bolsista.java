package br.edu.ifs.academico;

public class Bolsista extends Pessoa {

	public Bolsista(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		return "\n Orientador: " + orientador + "\n Valor da Bolsa: " + salario + "\n Dados do Cadastro: " + super.toString();
	}
	
	public double calcularDecimoTerceiro() {
		salario = 0.33 * salario;
		double resultado = salario;
		return resultado;
	}


	private String orientador;
	private double salario;

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}