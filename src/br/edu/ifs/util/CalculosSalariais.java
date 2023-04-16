package br.edu.ifs.util;

public abstract class CalculosSalariais {

	public static double CalculosSalariais(double salario) {

		double salarioLiquido = salario;

		if (salario <= 2000) {
			salarioLiquido = salario * 0.85;
		} else {

			salarioLiquido = salario * 0.73;
		}

		return salarioLiquido;

	}

}