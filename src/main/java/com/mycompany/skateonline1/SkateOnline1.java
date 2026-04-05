package com.mycompany.skateonline1;

import view.LoginView;

public class SkateOnline1 {
    public static void main(String[] args) {
        // Usuário inicial para garantir que exista um login válido
        Usuario usuarioInicial = new Usuario("Admin", "admin@email.com");
        BancoSimulado.listaUsuarios.add(usuarioInicial);

        // Produtos iniciais já são carregados no BancoSimulado (bloco static)

        // Abre a tela de Login como ponto de entrada do sistema
        LoginView login = new LoginView();
        login.setVisible(true);
    }
}