package com.mycompany.skateonline1;

import java.util.ArrayList;
import java.util.List;

public class BancoSimulado {
    public static List<Produto> listaProdutos = new ArrayList<>();
    public static List<Usuario> listaUsuarios = new ArrayList<>();

    static {
        // Produtos pré-cadastrados da loja de skate
        listaProdutos.add(new Produto("Shape Maple 8.0", 250.0, 10));
        listaProdutos.add(new Produto("Truck Independent 139", 350.0, 5));
        listaProdutos.add(new Produto("Roda Bones 52mm", 200.0, 20));
        listaProdutos.add(new Produto("Rolamento Bones Reds", 180.0, 15));
        listaProdutos.add(new Produto("Lixa Jessup", 40.0, 30));

        // Usuários pré-cadastrados (se quiser simular login)
        listaUsuarios.add(new Usuario("admin", "123"));
        listaUsuarios.add(new Usuario("cliente", "456"));
    }
}