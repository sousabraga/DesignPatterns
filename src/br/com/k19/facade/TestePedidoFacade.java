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
public class TestePedidoFacade {
    
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Financeiro financeiro = new Financeiro();
        PosVenda posVenda = new PosVenda();
        
        PedidoFacade facade = new PedidoFacade(estoque, financeiro, posVenda);
        Pedido pedido = new Pedido("Notebook", "Rafael Consentino", "Av. Brigadeiro Faria Lima, "
                + "nº 1571, São Paulo, SP");
        facade.registraPedido(pedido);
    }
}
