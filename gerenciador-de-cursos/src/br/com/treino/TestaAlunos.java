package br.com.treino;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Set<String> alunos = new LinkedHashSet<>();

		alunos.add("Jos� Victor");
		alunos.add("Rodrigo Pinheiro");
		alunos.add("Matheus Melo");
		alunos.add("Eduardo Melo");
		alunos.add("Luan Figueredo");
		alunos.add("Sthepanye");
		/**
		 * O m�todo add devolve um booleano que indica o sucesson da inser��o.
		 */
		System.out.println("Retorno da inser��o: " + alunos.add("Jos� Victor"));

		/**
		 * Um conjunto n�o define uma ordem, pois quando recebemos os elementos, eles
		 * est�o diferente da ordem de inser��o.
		 */
		System.out.println(alunos);
		System.out.println("Tamanho da cole��o alunos: " + alunos.size());

//		for (String string : alunos) {		
//			System.out.println(string);	
//		}
		/**
		 * For presente na interface Iterable.
		 */

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		String nomeDoAlunoAVerificar = "Jos� Victor";
		boolean esseAlunoEstaMatriculado = alunos.contains(nomeDoAlunoAVerificar);

		System.out.println("O aluno " + nomeDoAlunoAVerificar + " est� matriculado: " + esseAlunoEstaMatriculado);

	}

}
