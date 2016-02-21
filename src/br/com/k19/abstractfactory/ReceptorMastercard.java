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
public class ReceptorMastercard implements Receptor {
    
    @Override
    public String recebe() {
        System.out.println("Recebendo mensagem da Mastercard: ");
        String mensagem = "Mensagem da Mastercard";
        return mensagem;
    }
    
}
