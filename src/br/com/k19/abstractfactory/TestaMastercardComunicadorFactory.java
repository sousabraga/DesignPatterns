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
public class TestaMastercardComunicadorFactory {
    
    public static void main(String[] args) {
        
        ComunicadorFactory comunicadorFactory = new MastercardComunicadorFactory();

        String transacao = "Valor=560;Senha=123";

        Emissor emissor = comunicadorFactory.createEmissor();
        emissor.envia(transacao);
        
        Receptor receptor = comunicadorFactory.createReceptor();
        String mensagem = receptor.recebe();

        System.out.println(mensagem);
    }
}
