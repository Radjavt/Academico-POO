package br.edu.ifs.academico;

public class Fornecedor {

	public Fornecedor(String cnpj) {
		this.setCnpj(cnpj);
	}
	
	
	
	@Override
	public String toString() {
		return "\n CNPJ: " + cnpj + "\n Razão Social: " + razaoSocial + "\n Cidade: " + cidade;
	}
	
	private String cnpj;
	private String razaoSocial;
	private String cidade;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}