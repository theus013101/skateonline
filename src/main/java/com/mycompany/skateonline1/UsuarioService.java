package com.mycompany.skateonline1;

import com.mycompany.skateonline1.Usuario;
import com.mycompany.skateonline1.dao.UsuarioDAO;
import java.sql.SQLException;

public class UsuarioService {

    private UsuarioDAO dao;

    public UsuarioService() {
        dao = new UsuarioDAO();
    }

    public void cadastrarUsuario(Usuario usuario)
            throws SQLException {

        if (usuario.getNome() == null ||
            usuario.getNome().trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Nome obrigatório");
        }

        if (usuario.getEmail() == null ||
            usuario.getEmail().trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Email obrigatório");
        }

        if (usuario.getSenha() == null ||
            usuario.getSenha().trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Senha obrigatória");
        }

        dao.inserir(usuario);
    }

    public Usuario realizarLogin(
            String nome,
            String senha)
            throws SQLException {

        return dao.buscarPorNomeSenha(
                nome,
                senha
        );
    }
}