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
public class Telefonista extends Funcionario {
    
    private int ramal;
    
    public Telefonista(String nome, double salario, int ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }
    
    public int getRamal() {
        return this.ramal;
    }
    
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    @Override
    public void aceita(AtualizadorDeFuncionario atualizador) {
        atualizador.atualiza(this);
    }
}
