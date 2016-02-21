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
public class MastercardComunicadorFactory implements ComunicadorFactory {
    
    private EmissorCreator emissorCreator = new EmissorCreator();
    private ReceptorCreator receptorCreator = new ReceptorCreator();
    
    @Override
    public Emissor createEmissor() {
        return emissorCreator.create(EmissorCreator.MASTERCARD);
    }

    @Override
    public Receptor createReceptor() {
        return receptorCreator.create(ReceptorCreator.MASTERCARD);
    }  
}
