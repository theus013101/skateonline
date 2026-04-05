package com.mycompany.skateonline1;


import com.mycompany.skateonline1.Pedido;

public class ItemPedido {
    private int id;
    private Pedido pedido;
    private Produto produto;
    private int quantidade;

    public ItemPedido(int id, Pedido pedido, Produto produto, int quantidade) {
        this.id = id;
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}