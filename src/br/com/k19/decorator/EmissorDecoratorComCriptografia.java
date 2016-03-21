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
public class EmissorDecoratorComCriptografia extends EmissorDecorator {

    public EmissorDecoratorComCriptografia(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando uma mensagem criptografada: ");
        this.getEmissor().envia(criptografa(mensagem));
    }
        
    private String criptografa(String mensagem) {
        String mensagemCriptografada = new StringBuilder(mensagem).reverse().toString();
        return mensagemCriptografada;
    }
}
