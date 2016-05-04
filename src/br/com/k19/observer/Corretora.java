/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.observer;

/**
 *
 * @author matheus
 */
public class Corretora implements AcaoObserver {

    private String nome;
    
    public Corretora(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void notificaAlteracao(Acao acao) {
        System.out.println("Corretora " + this.nome + " sendo notificada: ");
        System.out.println("A ação " + acao.getCodigo() + " teve o seu valor"
                + "alterado para " + acao.getValor());
    }
    
}
