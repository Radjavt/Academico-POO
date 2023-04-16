package br.edu.ifs.academico;
import br.edu.ifs.util.*;

public class Professor extends Pessoa {

	public Professor(String nome) {
		super(nome);
	}
	
	private CalculosSalariais salarioLiquido ; 
	
	@Override
	public String toString() {
		return "\n Formacao: " + formacao + "\n Salario: R$ " + salario + "\n O Salario Liquido é: "+salarioLiquido.CalculosSalariais(salario)+ "\n Dados do Cadastro" + super.toString();
	}

	private String formacao;
	private double salario;
	
	
	public double calcularDecimoTerceiro() {
		double resultado = salario;
		return resultado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
}