/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exrelatorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class DBCon {

    private Connection con;
    private Statement st;
    
    public DBCon(String usuario, String senha) throws ClassNotFoundException {        
        try {        
            Class.forName("org.postgresql.Driver");
            System.out.println("ANTES");
            this.con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgis_25_sample", usuario, senha);
            this.st = this.con.createStatement();
            System.out.println("PASSOU");
        } catch (SQLException ex) {
            System.out.println("ERRO");
            Logger.getLogger(DBCon.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public ResultSet getAll(String tabela){
        try {
            return st.executeQuery("SELECT * FROM " + tabela);
        } catch (SQLException ex) {
            Logger.getLogger(DBCon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ResultSet getAll(String tabela, String where){
        try {
            return st.executeQuery("SELECT * FROM " + tabela + " " + where);
        } catch (SQLException ex) {
            Logger.getLogger(DBCon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ResultSet getOne(String tabela, int id){
        try {
            return st.executeQuery("SELECT * FROM " + tabela + " WHERE id = " + id);
        } catch (SQLException ex) {
            Logger.getLogger(DBCon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
