/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author matheus
 */
public class BBBoleto implements Boleto {

    private String sacado;
    private String cedente;
    private double valor;
    private Calendar vencimento;
    private int nossoNumero;
    
    public BBBoleto(String sacado, String cedente, double valor, Calendar vencimento, int nossoNumero) {
        this.sacado = sacado;
        this.cedente = cedente;
        this.valor = valor;
        this.vencimento = vencimento;
        this.nossoNumero = nossoNumero;
    }
    
    @Override
    public String getSacado() {
        return this.sacado;
    }

    @Override
    public String getCedente() {
        return this.cedente;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public Calendar getVencimento() {
        return this.vencimento;
    }

    @Override
    public int getNossoNumero() {
        return this.nossoNumero;
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append("Boleto BB\n");
        stringBuilder.append("Sacado: ").append(this.sacado).append("\n");
        stringBuilder.append("Cedente: ").append(this.cedente).append("\n");
        stringBuilder.append("Valor: ").append(this.valor).append("\n");
        stringBuilder.append("Vencimento: ").append(this.vencimento).append("\n");
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String format = simpleDateFormat.format(this.vencimento.getTime());
        
        stringBuilder.append("Vencimento: ").append(format).append("\n");
        stringBuilder.append("Nosso Número: ").append(this.nossoNumero).append("\n");
        
        return stringBuilder.toString();
    }
}
