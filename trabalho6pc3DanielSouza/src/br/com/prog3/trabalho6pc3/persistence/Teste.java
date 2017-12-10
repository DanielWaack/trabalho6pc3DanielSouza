package br.com.prog3.trabalho6pc3.persistence;

import java.util.List;

import br.com.prog3.trabalho6pc3.model.Aluno;

public class Teste {
	public static void main(String[] args) {

		// Connection con = ConnectionFactory.getConnection();

		/*
		 * AlunoDAOImp ad = new AlunoDAOImp(); Aluno a = new Aluno();
		 * 
		 * a.setMatricula(6); a.setNome("Maria Paula"); a.setRa("Taguatinga");
		 * System.out.println(ad.save(a));
		 */

		/*
		 * AlunoDAOImp ad = new AlunoDAOImp(); Aluno a = new Aluno(); a.setMatricula(6);
		 * a.setNome("Maria Paula Almeida"); a.setRa("Taguatinga Norte");
		 * System.out.println(ad.update(a));
		 */

		/*
		 * AlunoDAOImp ad = new AlunoDAOImp(); System.out.println(ad.delete(6));
		 */

		/*
		 * AlunoDAOImp ad = new AlunoDAOImp(); List<Aluno> alunos = ad.list(); if
		 * (alunos != null) { for (Aluno al : alunos) { System.out.println("Aluno: " +
		 * al.getNome()); } }
		 */

		AlunoDAOImp ad = new AlunoDAOImp();
		Aluno aluno = ad.findByMatricula(2);
		if (aluno != null) {
			System.out.println(aluno.getNome());
		}

	}
}
