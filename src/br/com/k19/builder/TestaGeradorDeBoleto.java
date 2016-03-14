/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.builder;

/**
 *
 * @author matheus
 */
public class TestaGeradorDeBoleto {
    
    public static void main(String[] args) {
        BoletoBuilder boletoBuilder = new BBBoletoBuilder();
        GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
        Boleto boleto = geradorDeBoleto.geraBoleto();
        System.out.println(boleto);
    }
}
