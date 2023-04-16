package br.edu.ifs.academico;

public class Estagiario extends Pessoa {

	public Estagiario(String nome) {
		super(nome);
	}


	@Override
	public String toString() {
		return "\n Instituicao: " + instituicao + "\n Periodo Atual: " + periodoAtual + "\n Curso: " + curso
				+ "\n Salario: " + salario + "\n Dados do Cadastro: " + super.toString();
	}


	private String instituicao;
	private String periodoAtual;
	private String curso;
	private double salario;
	
	public double calcularDecimoTerceiro() {
		salario = 0.33 * salario;
		double resultado = salario;
		return resultado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getPeriodoAtual() {
		return periodoAtual;
	}

	public void setPeriodoAtual(String periodoAtual) {
		this.periodoAtual = periodoAtual;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
