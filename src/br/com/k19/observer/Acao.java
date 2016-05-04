/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.observer;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author matheus
 */
public class Acao {
    
    private String codigo;
    private double valor;
    
    private Set<AcaoObserver> interessados = new HashSet<>();
    
    public Acao(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }
    
    public void registraInteressado(AcaoObserver interessado) {
        this.interessados.add(interessado);
    }
    
    public void cancelaInteresse(AcaoObserver interessado) {
        this.interessados.remove(interessado);
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
        this.interessados.stream().forEach(interessado -> {
            interessado.notificaAlteracao(this);
        });
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
}
