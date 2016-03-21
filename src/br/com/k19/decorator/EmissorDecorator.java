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
public abstract class EmissorDecorator implements Emissor {
    
    private Emissor emissor;
    
    public EmissorDecorator(Emissor emissor) {
        this.emissor = emissor;
    }
    
    public Emissor getEmissor() {
        return this.emissor;
    }
}
