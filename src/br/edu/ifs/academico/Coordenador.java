package br.edu.ifs.academico;

public class Coordenador extends Pessoa {

	public Coordenador(String nome) {
		super(nome);
	}

	@Override
	public String toString() {
		return "\n Curso: " + curso + "\n Salario: " + salario + "\n Formação: "+ formacao +"\n Dados: " + super.toString();
	}

	private String curso;
	private double salario;
	private String formacao;
	
	public double calcularDecimoTerceiro() {
		salario = 0.33 * salario;
		double resultado = salario;
		return resultado;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}