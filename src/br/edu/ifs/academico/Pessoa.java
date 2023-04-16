package br.edu.ifs.academico;

public class Pessoa {

	public Pessoa(String nome) {
		this.setNome(nome);
	}

	@Override
	public String toString() {

		return "\n Nome: " + nome + "\n Sexo: " + sexo + "\n Local de Nascimento: " + localNascimento + " \n Data Nascimento: "
				+ dataNascimento + "\n Valor do decimo: "+calcularDecimoTerceiro() ;
	}

	private String nome;
	private char sexo;
	private String localNascimento;
	private String dataNascimento;
	private double salario;

	public double calcularDecimoTerceiro() {
		salario = 0.33 * salario;
		double resultado = salario;
		return resultado;
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

	public String getLocalNascimento() {
		return localNascimento;
	}

	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
