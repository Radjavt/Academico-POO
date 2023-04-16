package br.edu.ifs.academico;

public class Psicologo extends Pessoa {

	public Psicologo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n Carga Horaria: "+cargaHoraria+"\n Número do Conselho: "+numeroConse+"\n Especialidade: " + especialidade + "\n Salario: " + salario + "\n Dados do Cadastro: " + super.toString();
	}

	private String especialidade;
	private double salario;
	private int cargaHoraria;
	private int numeroConse;
	
	public double calcularDecimoTerceiro() {
		salario = 0.33 * salario;
		double resultado = salario;
		return resultado;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getNumeroConse() {
		return numeroConse;
	}

	public void setNumeroConse(int numeroConse) {
		this.numeroConse = numeroConse;
	}

	
}