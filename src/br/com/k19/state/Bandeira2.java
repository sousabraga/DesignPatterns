/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.state;

/**
 *
 * @author matheus
 */
public class Bandeira2 implements Bandeira {

    @Override
    public double calculaValorDaCorrida(double tempo, double distancia) {
        return 10.0 + tempo * 3.0 + distancia * 4.0; 
    }
    
}
