package br.edu.ifs.academico;

public class Tecnico {

	private String nome;
	private char sexo;
	private String dataNasc;
	private String localNasc;
	private int numeroConse;
	private double cargaHoraria;
	private double salario;

	public Tecnico(String nome2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n Nome: " + nome + "\n Sexo: " + sexo + "\n Data de Nascimento: " + dataNasc + "\n Local de Nascimento: " + localNasc
				+ "\n Número do Conselho: " + numeroConse + "\n Carga Horaria: " + cargaHoraria + "\n Salario: " + salario + "\n Valor do decimo: "+calcularDecimoTerceiro();
	}
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getLocalNasc() {
		return localNasc;
	}

	public void setLocalNasc(String localNasc) {
		this.localNasc = localNasc;
	}

	public int getNumeroConse() {
		return numeroConse;
	}

	public void setNumeroConse(int numeroConse) {
		this.numeroConse = numeroConse;
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
}