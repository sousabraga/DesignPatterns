/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.factorymethod;

/**
 *
 * @author matheus
 */
public class EmissorJMS implements Emissor {

    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando a mensagem por JMS: ");
        System.out.println(mensagem);
    }
    
}
