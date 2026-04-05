package com.mycompany.skateonline1;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private Usuario cliente;
    private int numNF;
    private ArrayList<ItemPedido> itens;

    public Pedido(int id, Usuario cliente, int numNF) {
        this.id = id;
        this.cliente = cliente;
        this.numNF = numNF;
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(itens.size() + 1, this, produto, quantidade);
        itens.add(item);
    }

    public Usuario getCliente() {
        return cliente;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }
}