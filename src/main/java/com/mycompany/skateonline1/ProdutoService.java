package com.mycompany.skateonline1;

import com.mycompany.skateonline1.Produto;
import com.mycompany.skateonline1.dao.ProdutosDAO;

public class ProdutoService {

    private ProdutosDAO dao;

    public ProdutoService() {
        dao = new ProdutosDAO();
    }

    public boolean cadastrarProduto(Produto produto) {

        if (produto.getNome() == null ||
    produto.getNome().trim().isEmpty()) {

    throw new IllegalArgumentException(
            "Nome obrigatório");
}
        

        if (produto.getValor() <= 0) {

            throw new IllegalArgumentException(
                    "Valor inválido");
        }

        if (produto.getQuantidade() < 0) {

            throw new IllegalArgumentException(
                    "Quantidade inválida");
        }

        return dao.inserir(produto);
    }
}