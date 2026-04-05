package com.mycompany.skateonline1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/skateonline?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "rootroot";
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado!");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.err.println("Erro ao acessar o banco: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}