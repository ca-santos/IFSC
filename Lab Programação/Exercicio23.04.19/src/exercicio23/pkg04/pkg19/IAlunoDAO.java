/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio23.pkg04.pkg19;

import java.util.List;

interface IAlunoDAO {

    public Aluno retrieve();
    public Aluno update();
    public Aluno delete();
    public List<Aluno> retrieveAll();
    public void create(Aluno aluno1);

}
