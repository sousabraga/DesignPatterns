/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.proxy;

/**
 *
 * @author matheus
 */
public class ContaPadrao implements Conta {
    
    private double saldo;
    
    @Override
    public void deposita(double valor) {
        this.saldo += valor; 
    }
    
    @Override
    public void saca(double valor) {
        this.saldo -= valor;
    }
    
    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
