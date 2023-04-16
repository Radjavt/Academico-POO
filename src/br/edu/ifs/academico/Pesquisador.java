package br.edu.ifs.academico;

public class Pesquisador extends Pessoa {

	public Pesquisador(String nome) {
		super(nome);
	}

	@Override
	public String toString() {
		return "\n Codigo de Pesquisa: " + codigoPesquisa + "\n Grupo de Pesquisa: " + grupoPesquisa
				+ "\n Instituicao Vinculada: " + instituicaoVinculada + "\n Salario: " + salario + "\n Dados do Cadastro: "
				+ super.toString();
	}

	private int codigoPesquisa;
	private String grupoPesquisa;
	private String instituicaoVinculada;
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

	public int getCodigoPesquisa() {
		return codigoPesquisa;
	}

	public void setCodigoPesquisa(int codigoPesquisa) {
		this.codigoPesquisa = codigoPesquisa;
	}

	public String getGrupoPesquisa() {
		return grupoPesquisa;
	}

	public void setGrupoPesquisa(String grupoPesquisa) {
		this.grupoPesquisa = grupoPesquisa;
	}

	public String getInstituicaoVinculada() {
		return instituicaoVinculada;
	}

	public void setInstituicaoVinculada(String instituicaoVinculada) {
		this.instituicaoVinculada = instituicaoVinculada;
	}

}