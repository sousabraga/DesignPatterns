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
public class BBBoletoBuilder implements BoletoBuilder {

    private String sacado;
    private String cedente;
    private double valor;
    private Calendar vencimento;
    private int nossoNumero;
    
    @Override
    public void buildSacado(String sacado) {
        this.sacado = sacado;
    }

    @Override
    public void buildCedente(String cedente) {
        this.cedente = cedente;
    }

    @Override
    public void buildValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void buildVencimento(Calendar vencimento) {
        this.vencimento = vencimento;
    }

    @Override
    public void buildNossoNumero(int nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    @Override
    public Boleto getBoleto() {
        return new BBBoleto(this.sacado, this.cedente, this.valor, this.vencimento, this.nossoNumero);
    }
    
}
