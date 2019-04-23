/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio23.pkg04.pkg19;

import java.util.List;

/**
 *
 * @author Aluno
 */
public class Exercicio230419 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        IAlunoDAO alunoDAO = new AlunoDAOPG();
        Aluno aluno1 = new Aluno(123456, "Pizza da Silva");
        System.out.println(aluno1.getNome());
//        alunoDAO.create(aluno1);
//        List<Aluno> listaAluno = alunoDAO.retrieveAll();
//        for (Aluno aluno : listaAluno) {
//            System.out.println(aluno.getMatricula() + "=>" + aluno.getNome());
//        }

    }

}
