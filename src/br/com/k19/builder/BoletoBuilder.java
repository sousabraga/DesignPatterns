/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.builder;

import java.util.Calendar;

/**
 *
 * @author matheus
 */
public interface BoletoBuilder {
    void buildSacado(String sacado);
    void buildCedente(String cedente);
    void buildValor(double valor);
    void buildVencimento(Calendar vencimento);
    void buildNossoNumero(int nossoNumero);
    
    Boleto getBoleto();
}
