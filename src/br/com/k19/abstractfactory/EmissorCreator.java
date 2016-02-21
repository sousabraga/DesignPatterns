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
public class EmissorCreator {
    
    public static final int VISA = 0;
    public static final int MASTERCARD = 1;
    
    public Emissor create(int tipoDoEmissor) {
        switch(tipoDoEmissor) {
            case EmissorCreator.VISA:
                return new EmissorVisa();
            case EmissorCreator.MASTERCARD:
                return new EmissorMastercard();
            default:
                throw new IllegalArgumentException("Tipo de emissor não suportado.");
        }
    }
}
