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
public class TestaContas {
    
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();
        
        contaCorrente.deposita(100);
        contaCorrente.saca(10);
        
        contaPoupanca.deposita(100);
        contaPoupanca.saca(10);
        
        System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
    }
}
