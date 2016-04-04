/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class CentralDeTaxi {
    
    private List<Taxi> taxisLivres = new ArrayList<>();
    private List<Passageiro> passageiroEmEspera = new ArrayList<>();
    
    public synchronized void adicionaTaxiDisponivel(Taxi taxi) {
        System.out.println("Taxi " + taxi.getId() + " voltou para fila.");
        taxisLivres.add(taxi);
        this.notifyAll();
    }
    
    public void pedeTaxi(Passageiro passageiro) {
        Taxi taxi = this.esperaTaxi(passageiro);
        System.out.println("Taxi " + taxi.getId() + " levando " + passageiro.getNome());
        taxi.atende();
    }
    
    private Taxi esperaTaxi(Passageiro passageiro) {
        this.passageiroEmEspera.add(passageiro);
        synchronized (this) {
            while (this.taxisLivres.isEmpty() || !this.passageiroEmEspera.get(0).equals(passageiro)) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            this.passageiroEmEspera.remove(0);
            return this.taxisLivres.remove(0);
        }
    }
    
}
