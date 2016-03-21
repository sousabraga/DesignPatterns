/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.adapter;

/**
 *
 * @author matheus
 */
public class ControleDePontoAdapter extends ControleDePonto {
    
    private ControleDePontoNovo controleDePontoNovo;
    
    public ControleDePontoAdapter() {
        this.controleDePontoNovo = new ControleDePontoNovo();
    }
    
    @Override
    public void registraEntrada(Funcionario funcionario) {
        this.controleDePontoNovo.registra(funcionario, true);
    }
    
    @Override
    public void registraSaida(Funcionario funcionario) {
        this.controleDePontoNovo.registra(funcionario, false);
    }
}
    