/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.abstractfactory;

/**
 *
 * @author matheus
 */
public class ReceptorVisa implements Receptor {

    @Override
    public String recebe() {
        System.out.println("Recebendo mensagem da Visa: ");
        String mensagem = "Mensagem da Visa";
        return mensagem;
    }
    
}
