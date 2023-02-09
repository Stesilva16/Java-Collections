package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Albeto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Ariche");
		alunos.add("Sergio Lopes");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira"); 
		System.out.println("Sergio Lopes");
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aulno ->{
			System.out.println(alunos);
		});
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
	}
		
	}
