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
public class TestaObserver {
    
    public static void main(String[] args) {
        Acao acao = new Acao("VALE3", 45.27);
        
        Corretora corretora1 = new Corretora("Corretora1");
        Corretora corretora2 = new Corretora("Corretora2");
        
        acao.registraInteressado(corretora1);
        acao.registraInteressado(corretora2);
        
        acao.setValor(50);
    }
}
