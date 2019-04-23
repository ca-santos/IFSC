/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio23.pkg04.pkg19;

/**
 *
 * @author Aluno
 */
public class Aluno {

    private Integer matricula;
    private String nome;

    public Aluno(Integer matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

}
