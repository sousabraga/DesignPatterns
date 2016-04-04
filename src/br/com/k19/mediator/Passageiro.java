/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.mediator;

/**
 *
 * @author matheus
 */
public class Passageiro implements Runnable {
    
    private String nome;
    private CentralDeTaxi central;
    
    public Passageiro(String nome, CentralDeTaxi central) {
        this.nome = nome;
        this.central = central;
    }

    public String getNome() {
        return this.nome;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            this.central.pedeTaxi(this);
        }
    }
}
