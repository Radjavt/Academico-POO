package br.edu.ifs.academico;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicativo {
	static Scanner ler = new Scanner(System.in);

	static String nome;
	static char sexo;
	static String dataNascimento;
	static String localNascimento;
	static String curso;
	static String formacao;
	static String periodoAtual;
	static String instituicaoVinculada;

	public static void main(String[] args) {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Professor> professores = new ArrayList<Professor>();
		ArrayList<Estagiario> estagiarios = new ArrayList<Estagiario>();
		ArrayList<Pesquisador> pesquisadores = new ArrayList<Pesquisador>();
		ArrayList<Psicologo> psicologos = new ArrayList<Psicologo>();
		ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
		ArrayList<Coordenador> coordenadores = new ArrayList<Coordenador>();
		ArrayList<Bolsista> bolsistas = new ArrayList<Bolsista>();
		ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

		System.out.println(Menu.getMenu());
		System.out.println("Escolha uma opção: ");
		int opcao = ler.nextInt();

		while (opcao != 0) {
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Aluno");
				cadastrarAluno(alunos);
				break;
			case 2:
				System.out.println("Listar Aluno");
				listarAluno(alunos);
				break;
			case 3:
				System.out.println("Cadastrar Professor");
				cadastrarProfessor(professores);
				break;
			case 4:
				System.out.println("Listar Professor");
				listarProfessor(professores);
				break;
			case 5:
				System.out.println("Cadastrar Psicologo");
				cadastrarPsicologo(psicologos);
				break;
			case 6:
				System.out.println("Listar Psicologo");
				listarPiscologo(psicologos);
				break;
			case 7:
				System.out.println("Cadastrar Tecnico");
				cadastrarTecnico(tecnicos);
				break;
			case 8:
				System.out.println("Listar Tecnico");
				listarTecnico(tecnicos);
				break;
			case 9:
				System.out.println("Cadastrar Pesquisador");
				cadastrarPesquisador(pesquisadores);
				break;
			case 10:
				System.out.println("Listar Pesquisador");
				listarPesquisador(pesquisadores);
				break;
			case 11:
				System.out.println("Cadastrar Estagiario");
				cadastrarEstagiario(estagiarios);
				break;
			case 12:
				System.out.println("Listar Estagiario");
				listarEstagiario(estagiarios);
				break;
			case 13:
				System.out.println("Cadastrar Coordenador");
				cadastrarCoordenador(coordenadores);
				break;
			case 14:
				System.out.println("Listar Coordenador");
				listarCoordenador(coordenadores);
				break;
			case 15:
				System.out.println("Cadastrar Bolsista");
				cadastrarBolsista(bolsistas);
				break;
			case 16:
				System.out.println("Listar Bolsista");
				listarBolsista(bolsistas);
				break;
			case 17:
				System.out.println("Cadastrar Fornecedor");
				cadastrarFornecedor(fornecedores);
				break;
			case 18:
				System.out.println("Listar Fornecedor");
				listarFornecedor(fornecedores);
				break;

			}

			System.out.println(Menu.getMenu());
			opcao = ler.nextInt();

		}
		System.out.println("== FIM ==");

	}

	private static void listarCoordenador(ArrayList<Coordenador> coordenadores) {
		System.out.println(coordenadores.toString());
	}

	private static void cadastrarCoordenador(ArrayList<Coordenador> coordenadores) {
		System.out.println("Nome: ");
		nome = ler.next();
		System.out.println("Curso: ");
		curso = ler.next();
		System.out.println("Formação: ");
		formacao = ler.next();
		System.out.println("Sexo: ");
		sexo = ler.next().charAt(0);
		sexo = Character.toUpperCase(sexo);
		System.out.println("Local de Nascimento: ");
		localNascimento = ler.next();
		System.out.println("Data de Nascimento: ");
		dataNascimento = ler.next();
		System.out.println("Valor do salario R$ ");
		double salario = ler.nextDouble();

		Coordenador coordenador = new Coordenador(nome);
		coordenador.setSexo(sexo);
		coordenador.setCurso(curso);
		coordenador.setFormacao(formacao);
		coordenador.setNome(nome);
		coordenador.setDataNascimento(dataNascimento);
		coordenador.setLocalNascimento(localNascimento);
		coordenador.setSalario(salario);
		coordenadores.add(coordenador);

	}

	private static void listarEstagiario(ArrayList<Estagiario> estagiarios) {
		System.out.println(estagiarios.toString());
	}

	private static void cadastrarEstagiario(ArrayList<Estagiario> estagiarios) {
		System.out.println("Nome: ");
		nome = ler.next();
		System.out.println("Curso: ");
		String curso = ler.next();
		System.out.println("Instituição: ");
		String instituicao = ler.next();
		System.out.println("Sexo: ");
		sexo = ler.next().charAt(0);
		sexo = Character.toUpperCase(sexo);
		System.out.println("Periodo Atual: ");
		periodoAtual = ler.next();
		System.out.println("Local de Nascimento: ");
		localNascimento = ler.next();
		System.out.println("Data de Nascimento: ");
		dataNascimento = ler.next();
		System.out.println("Valor do salario R$ ");
		double salario = ler.nextDouble();

		Estagiario estagiario = new Estagiario(nome);
		estagiario.setNome(nome);
		estagiario.setSexo(sexo);
		estagiario.setDataNascimento(dataNascimento);
		estagiario.setLocalNascimento(localNascimento);
		estagiario.setInstituicao(instituicao);
		estagiario.setCurso(curso);
		estagiario.setSalario(salario);
		estagiario.setPeriodoAtual(periodoAtual);

		estagiarios.add(estagiario);

	}

	private static void listarPesquisador(ArrayList<Pesquisador> pesquisadores) {
		System.out.println(pesquisadores.toString());

	}

	private static void cadastrarPesquisador(ArrayList<Pesquisador> pesquisadores) {
		System.out.println("Nome: ");
		nome = ler.next();
		System.out.println("Codigo de Pesquisa: ");
		int codigoPesquisa = ler.nextInt();
		System.out.println("Sexo: ");
		sexo = ler.next().charAt(0);
		sexo = Character.toUpperCase(sexo);
		System.out.println("Grupo de Pesquisa: ");
		String grupoPesquisa = ler.next();
		System.out.println("Instituição Vinculada: ");
		instituicaoVinculada = ler.next();
		System.out.println("Local de Nascimento: ");
		localNascimento = ler.next();
		System.out.println("Data de Nascimento: ");
		dataNascimento = ler.next();
		System.out.println("Valor do salario R$ ");
		double salario = ler.nextDouble();

		Pesquisador pesquisador = new Pesquisador(nome);
		pesquisador.setInstituicaoVinculada(instituicaoVinculada);
		pesquisador.setCodigoPesquisa(codigoPesquisa);
		pesquisador.setDataNascimento(dataNascimento);
		pesquisador.setLocalNascimento(localNascimento);
		pesquisador.setGrupoPesquisa(grupoPesquisa);
		pesquisador.setNome(nome);
		pesquisador.setSexo(sexo);
		pesquisador.setSalario(salario);

		pesquisadores.add(pesquisador);

	}

	private static void listarTecnico(ArrayList<Tecnico> tecnicos) {
		System.out.println(tecnicos.toString());
	}

	private static void cadastrarTecnico(ArrayList<Tecnico> tecnicos) {
		System.out.println("Nome: ");
		nome = ler.next();
		System.out.println("Sexo: ");
		sexo = ler.next().charAt(0);
		sexo = Character.toUpperCase(sexo);
		System.out.println("Local de Nascimento: ");
		localNascimento = ler.next();
		System.out.println("Data de Nascimento: ");
		dataNascimento = ler.next();
		System.out.println("Carga Horaria: ");
		int cargaHoraria = ler.nextInt();
		System.out.println("Número do Conselho: ");
		int numeroConse = ler.nextInt();
		System.out.println("Valor do salario R$ ");
		double salario = ler.nextDouble();

		Tecnico tecnico = new Tecnico(nome);
		tecnico.setNome(nome);
		tecnico.setDataNasc(dataNascimento);
		tecnico.setLocalNasc(localNascimento);
		tecnico.setSexo(sexo);
		tecnico.setCargaHoraria(cargaHoraria);
		tecnico.setSalario(salario);
		tecnico.setNumeroConse(numeroConse);
		

		tecnicos.add(tecnico);

	}

	private static void listarPiscologo(ArrayList<Psicologo> psicologos) {
		System.out.println(psicologos.toString());
	}

	private static void cadastrarPsicologo(ArrayList<Psicologo> psicologos) {
		System.out.println("Nome: ");
		nome = ler.next();
		System.out.println("Sexo: ");
		sexo = ler.next().charAt(0);
		sexo = Character.toUpperCase(sexo);
		System.out.println("Local de Nascimento");
		localNascimento = ler.next();
		System.out.println("Data de Nascimento");
		dataNascimento = ler.next();
		System.out.println("Carga Horaria: ");
		int cargaHoraria = ler.nextInt();
		System.out.println("Especialidade: ");
		String especialidade = ler.next();
		System.out.println("Número do Conselho: ");
		int numeroConse = ler.nextInt();
		System.out.println("Valor do salario R$ ");
		double salario = ler.nextDouble();

		Psicologo psicologo = new Psicologo(nome);
		psicologo.setNome(nome);
		psicologo.setLocalNascimento(localNascimento);
		psicologo.setSexo(sexo);
		psicologo.setDataNascimento(dataNascimento);
		psicologo.setSalario(salario);
		psicologo.setEspecialidade(especialidade);
		psicologo.setCargaHoraria(cargaHoraria);
		psicologo.setNumeroConse(numeroConse);
		
		psicologos.add(psicologo);

	}

	private static void listarProfessor(ArrayList<Professor> professores) {
		System.out.println(professores.toString());
	}

	private static void cadastrarProfessor(ArrayList<Professor> professores) {
		System.out.println("Formação: ");
		String formacao = ler.next();
		System.out.println("Nome: ");
		nome = ler.next();
		System.out.println("Sexo: ");
		sexo = ler.next().charAt(0);
		sexo = Character.toUpperCase(sexo);
		System.out.println("Local de Nascimento: ");
		localNascimento = ler.next();
		System.out.println("Data de Nascimento: ");
		dataNascimento = ler.next();
		System.out.println("Valor do salario R$ ");
		double salario = ler.nextDouble();

		Professor professor = new Professor(nome);
		professor.setFormacao(formacao);
		professor.setDataNascimento(dataNascimento);
		professor.setLocalNascimento(localNascimento);
		professor.setNome(nome);
		professor.setSexo(sexo);
		professor.setSalario(salario);

		professores.add(professor);
	}

	private static void cadastrarAluno(ArrayList<Aluno> alunos) {

		System.out.println("Nome: ");
		nome = ler.next();
		System.out.println("Sexo: ");
		sexo = ler.next().charAt(0);
		System.out.println("Local de Nascimento: ");
		localNascimento = ler.next();
		System.out.println("Data de Nascimento: ");
		dataNascimento = ler.next();
		System.out.println("Primeira Nota: ");
		double nota1 = ler.nextDouble();
		System.out.println("Segunda Nota: ");
		double nota2 = ler.nextDouble();
		System.out.println("Terceira Nota: ");
		double nota3 = ler.nextDouble();
		System.out.println("Valor da Bolsa: ");
		double bolsaAluno = ler.nextDouble();

		Aluno aluno = new Aluno(nome);
		aluno.setDataNascimento(dataNascimento);
		aluno.setLocalNascimento(localNascimento);
		aluno.setNome(nome);
		aluno.setSexo(sexo);
		aluno.setNota1(nota1);
		aluno.setNota2(nota2);
		aluno.setNota3(nota3);
		aluno.setBolsaAluno(bolsaAluno);

		alunos.add(aluno);

	}

	private static void listarAluno(ArrayList<Aluno> alunos) {
		System.out.println(alunos.toString());
	}

	private static void cadastrarBolsista(ArrayList<Bolsista> bolsistas) {
		System.out.println("Nome: ");
		nome = ler.next();
		System.out.println("Sexo: ");
		sexo = ler.next().charAt(0);
		System.out.println("Local de Nascimento: ");
		localNascimento = ler.next();
		System.out.println("Data de Nascimento: ");
		dataNascimento = ler.next();
		System.out.println("Valor da Bolsa R$ ");
		double salario = ler.nextDouble();
		System.out.println("Orientador: ");
		String orientador = ler.next();

		Bolsista bolsista = new Bolsista(nome);
		bolsista.setDataNascimento(dataNascimento);
		bolsista.setLocalNascimento(localNascimento);
		bolsista.setNome(nome);
		bolsista.setSexo(sexo);
		bolsista.setOrientador(orientador);
		bolsista.setSalario(salario);
	
		bolsistas.add(bolsista);
	}

	private static void listarBolsista(ArrayList<Bolsista> bolsistas) {
		System.out.println(bolsistas.toString());
	}

	private static void cadastrarFornecedor(ArrayList<Fornecedor> fornecedores) {
		System.out.println("CNPJ: ");
		String cnpj = ler.next();
		System.out.println("Razão Social: ");
		String razaoSocial = ler.next();
		System.out.println("Cidade: ");
		String cidade = ler.next();

		Fornecedor fornecedor = new Fornecedor(cnpj);
		fornecedor.setCnpj(cnpj);
		fornecedor.setRazaoSocial(razaoSocial);
		fornecedor.setCidade(cidade);

		fornecedores.add(fornecedor);
	}

	private static void listarFornecedor(ArrayList<Fornecedor> fornecedores) {
		System.out.println(fornecedores.toString());
	}
}