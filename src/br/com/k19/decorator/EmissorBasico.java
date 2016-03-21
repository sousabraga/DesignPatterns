/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.decorator;

/**
 *
 * @author matheus
 */
public class EmissorBasico implements Emissor {

    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando uma mensagem: ");
        System.out.println(mensagem);
    }

}
