/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Denilson
 */
public class ModuloConexao {

    //Método responsal por estabelecer a conexão com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //A linha a baixo "chama" o drive
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informação referente ao banco
        //Informa qual o caminho do banco e o seu nome
        String url = "jdbc:mysql://localhost:3309/dbinfox";
        //Informa o nome e senha do usuario que pode acessar o banco
        String user = "root";
        String password = "";
        //Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //System.out.println(e);
            return null;
        }
    }
}
