/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.visitor;

/**
 *
 * @author matheus
 */
public class AtualizadorSalarial implements AtualizadorDeFuncionario {

    @Override
    public void atualiza(Gerente gerente) {
         gerente.setSalario(gerente.getSalario() * 1.43);
    }
    
    @Override
    public void atualiza(Telefonista telefonista) {
         telefonista.setSalario(telefonista.getSalario() * 1.27);
    }
    
}
