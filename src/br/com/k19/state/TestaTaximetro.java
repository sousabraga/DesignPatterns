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
public class TestaTaximetro {
    
    public static void main(String[] args) {
        
        Bandeira1 b1 = new Bandeira1();
        Bandeira2 b2 = new Bandeira2();
        
        Taximetro taximetro = new Taximetro(b1);
        
        double valor1 = taximetro.calculaValorDaCorrida(10, 20);
        System.out.println("Valor da corrida em bandeira 1: " + valor1);
        
        taximetro.setBandeira(b2);
        
        double valor2 = taximetro.calculaValorDaCorrida(5, 30);
        System.out.println("Valor da corrida em bandeira 2: " + valor2);
    }
}
