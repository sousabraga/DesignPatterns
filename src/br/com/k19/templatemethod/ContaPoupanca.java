/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.templatemethod;

/**
 *
 * @author matheus
 */
public class ContaPoupanca extends Conta {

    @Override
    public double calculaTaxa() {
        return 1;
    }    
    
}
