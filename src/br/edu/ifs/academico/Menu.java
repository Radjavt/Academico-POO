package br.edu.ifs.academico;

public abstract class Menu {
	public static String getMenu() {
		String menu = ("**********SISTEMA ACADÊMICO***************\n"
				+ "========Menu=========\n"
				+ "1-Cadastrar Aluno\n"
				+ "2-Listar Aluno\n" 
				+ "3-Cadastrar Professor\n"
				+ "4-Listar Professor\n"
				+ "5-Cadastrar Psicologo\n"
				+ "6-Listar Psicologo\n"
				+ "7-Cadastrar Tecnico\n"
				+ "8-Listar Tecnico\n"
				+ "9-Cadastrar Pesquisador\n"
				+ "10-Listar Pesquisador\n"
				+ "11-Cadastrar Estagiario\n"
				+ "12-Listar Estagiario\n"
				+ "13-Cadastrar Coordenador\n"
				+ "14-Listar Coodernador\n"
				+ "15-Cadastrar Bolsista\n"
				+ "16-Listar Bolsista\n"
				+ "17-Cadastrar Fornecedor\n"
				+ "18-Listar Fornecedor\n"
				+ "0-Sair ");

		return menu;
	}
}
