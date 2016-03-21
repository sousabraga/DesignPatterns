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
public class TesteEmissorDecorator {
    
    public static void main(String[] args) {
        String mensagem = "Mensagem";
        
        Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.envia(mensagem);
        
        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.envia(mensagem);
        
        Emissor emissorCriptCompr = new EmissorDecoratorComCriptografia(new EmissorDecoratorComCompressao(new EmissorBasico()));
        emissorCriptCompr.envia(mensagem);
    }
}
