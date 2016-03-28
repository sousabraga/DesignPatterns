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
public interface Conta {
    
    void deposita(double valor);
    void saca(double valor);
    double getSaldo();
    
}
