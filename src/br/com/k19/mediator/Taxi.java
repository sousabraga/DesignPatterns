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
public class Taxi {

    private int id;
    private static int contador = 0;
    private CentralDeTaxi central;
    
    public Taxi(CentralDeTaxi central) {
        this.central = central;
        this.id = Taxi.contador++;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void atende() {
        try {
            Thread.sleep((long) (Math.random() * 3000.0));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        this.central.adicionaTaxiDisponivel(this);
    }
}




