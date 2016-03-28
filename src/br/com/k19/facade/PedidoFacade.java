/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.facade;

/**
 *
 * @author matheus
 */
public class PedidoFacade {
    
    private Estoque estoque;
    private Financeiro financeiro;
    private PosVenda posVenda;
    
    public PedidoFacade(Estoque estoque, Financeiro financeiro, PosVenda posVenda) {
        this.estoque = estoque;
        this.financeiro = financeiro;
        this.posVenda = posVenda;
    }
    
    public void registraPedido(Pedido pedido) {
        this.estoque.enviaProduto(pedido.getProduto(), pedido.getEnderecoDeEntrega());
        this.financeiro.fatura(pedido.getCliente(), pedido.getProduto());
        this.posVenda.agendaContato(pedido.getCliente(), pedido.getProduto());
    }
}
