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
public class TestaCentralDeTaxi {
    
    public static void main(String[] args) {
        
        CentralDeTaxi central = new CentralDeTaxi();
        
        Passageiro p1 = new Passageiro("Rafael Consentino", central);
        Passageiro p2 = new Passageiro("Marcelo Martins", central);
        Passageiro p3 = new Passageiro("Jonas Hirata", central);
    
        Taxi t1 = new Taxi(central);
        central.adicionaTaxiDisponivel(t1);
        
        Taxi t2 = new Taxi(central);
        central.adicionaTaxiDisponivel(t2);
        
        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
    }
}
