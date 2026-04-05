package com.mycompany.skateonline1.dao;

import com.mycompany.skateonline1.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mycompany.skateonline1.Conexao;

public class UsuarioDAO {

   
    public void inserir(Usuario u) throws SQLException {
        Connection conn = Conexao.getConnection();
        String sql = "INSERT INTO usuario (nome, email, senha) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, u.getNome());
        stmt.setString(2, u.getEmail());
        stmt.setString(3, u.getSenha());
        stmt.executeUpdate();
        conn.close();
    }

   
    public Usuario buscarPorNomeSenha(String nome, String senha) throws SQLException {
        Connection conn = Conexao.getConnection();
        String sql = "SELECT * FROM usuario WHERE nome=? AND senha=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, senha);
        ResultSet rs = stmt.executeQuery();

        Usuario u = null;
        if (rs.next()) {
            u = new Usuario(
                rs.getString("nome"),
                rs.getString("email"),
                rs.getString("senha")
            );
        }

        conn.close();
        return u;
    }

    public Usuario validarLogin(String nome, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}