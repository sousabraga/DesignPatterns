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
public class Taximetro {
    
    private Bandeira bandeira;
    
    public Taximetro(Bandeira bandeira) {
        this.bandeira = bandeira;
    }
    
    public Bandeira getBandeira() {
        return this.bandeira;
    }
    
    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }
    
    public double calculaValorDaCorrida(double tempo, double distancia) {
        return this.bandeira.calculaValorDaCorrida(tempo, distancia);
    }
}
