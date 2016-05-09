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
public abstract class Conta {
    
    private double saldo;
    
    public void deposita(double valor) {
        this.saldo += valor;
        this.saldo -= this.calculaTaxa();
    }
    
    public void saca(double valor) {
        this.saldo -= valor;
        this.saldo -= this.calculaTaxa(); 
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public abstract double calculaTaxa();
}
