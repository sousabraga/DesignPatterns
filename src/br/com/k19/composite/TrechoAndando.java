/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.composite;

/**
 *
 * @author matheus
 */
public class TrechoAndando implements Trecho {

    private String direcao;
    private double distancia;
    
    public TrechoAndando(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }
    
    @Override
    public void imprime() {
        System.out.println("Vá andando: ");
        System.out.println(this.direcao);
        System.out.println("A distância percorrida será de: " + this.distancia + " metros");
    }
    
}
