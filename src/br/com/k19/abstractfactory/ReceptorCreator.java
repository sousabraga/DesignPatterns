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
public class ReceptorCreator {
    
    public static final int VISA = 0;
    public static final int MASTERCARD = 1;
    
    public Receptor create(int tipoDeReceptor) {
        switch(tipoDeReceptor) {
            case EmissorCreator.VISA:
                return new ReceptorVisa();
            case EmissorCreator.MASTERCARD:
                return new ReceptorMastercard();
            default:
                throw new IllegalArgumentException("Tipo de receptor não suportado.");
        }
    }
}
