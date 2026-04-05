package com.mycompany.skateonline1.dao;

import com.mycompany.skateonline1.Conexao;
import com.mycompany.skateonline1.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutosDAO {

    // Inserir novo produto
    public boolean inserir(Produto produto) {
        Connection conn = Conexao.getConnection();
        if (conn != null) {
            try {
                String sql = "INSERT INTO produtos (nome, valor, quantidade) VALUES (?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, produto.getNome());
                stmt.setDouble(2, produto.getValor());
                stmt.setInt(3, produto.getQuantidade());

                int linhas = stmt.executeUpdate();
                stmt.close();
                conn.close();
                return linhas > 0;
            } catch (SQLException e) {
                System.err.println("Erro ao inserir produto: " + e.getMessage());
            }
        }
        return false;
    }

    // Listar todos os produtos
    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        Connection conn = Conexao.getConnection();

        if (conn != null) {
            try {
                String sql = "SELECT id, nome, valor, quantidade FROM produtos";
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Produto p = new Produto();
                    p.setId(rs.getInt("id"));
                    p.setNome(rs.getString("nome"));
                    p.setValor(rs.getDouble("valor"));
                    p.setQuantidade(rs.getInt("quantidade"));
                    produtos.add(p);
                }

                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                System.err.println("Erro ao carregar produtos: " + e.getMessage());
            }
        }
        return produtos;
    }
}