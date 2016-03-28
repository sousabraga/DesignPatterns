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
public class TesteProxy {

    public static void main(String[] args) {

        Conta contaPadrao = new ContaPadrao();
        ContaProxy contaProxy = new ContaProxy(contaPadrao);
        
        contaProxy.deposita(100);
        contaProxy.saca(59);
        System.out.println("Saldo: " + contaProxy.getSaldo());
    }
}
