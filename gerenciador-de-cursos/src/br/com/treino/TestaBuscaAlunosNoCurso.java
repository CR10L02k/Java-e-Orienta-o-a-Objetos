package br.com.treino;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es", "Paulo Silvaira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando aula", 20));
		javaColecoes.adiciona(new Aula("Modelando cole��es", 24));

		Aluno a1 = new Aluno("Jos� Victor Santos", 34672);
		Aluno a2 = new Aluno("Rodrigo Pinheiro", 56017);
		Aluno a3 = new Aluno("Matheus Melo", 17045);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem � o aluno com a matricula " + a1.getNumeroMatricula());
		Aluno aluno = javaColecoes.buscaMatriculado(348672);
		
		System.out.println("ALUNO: " + aluno);
		
	}

}
