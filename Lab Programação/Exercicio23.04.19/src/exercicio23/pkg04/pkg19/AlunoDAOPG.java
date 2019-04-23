/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio23.pkg04.pkg19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class AlunoDAOPG implements IAlunoDAO {

    private Connection con;

    public AlunoDAOPG() {
        try {
            this.con = DriverManager.getConnection("jdbc:postgresql://"
                    + "localhost:55415/postgres", "aluno", "aluno");
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAOPG.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void create(Aluno a) {
      
        try {
            Statement stmt = this.con.createStatement();
            String sqlCreate = "INSERT INTO aluno VALUES(" + a.getMatricula() + ",'" + a.getNome() + "'  );";
            stmt.execute(sqlCreate);
            System.out.println(sqlCreate);
            this.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAOPG.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public List<Aluno> retrieveAll() {
        List<Aluno> listaAluno = new ArrayList<Aluno>();
        try {

            Statement stmt = this.con.createStatement();
            String sqlSelect = "SELECT * FROM aluno;";
            ResultSet resultSet = stmt.executeQuery(sqlSelect);
            while (resultSet.next()) {
                Integer matricula = resultSet.getInt("matricula");
                String nome = resultSet.getString("nome");
                listaAluno.add(new Aluno(matricula, nome));
            }
            resultSet.close();
            this.con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaAluno;
    }

    @Override
    public Aluno retrieve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
