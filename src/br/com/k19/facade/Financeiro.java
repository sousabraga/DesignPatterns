/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.facade;

/**
 *
 * @author matheus
 */
public class Financeiro {
    
    public void fatura(String cliente, String produto) {
        System.out.println("Fatura:");
        System.out.println("Cliente: " + cliente);
        System.out.println("Produto: " + produto);
    }
}
