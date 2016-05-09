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
public class Gerente extends Funcionario {

    private String senha;
    
    public Gerente(String nome, double salario, String senha) {
        super(nome, salario);
        this.senha = senha;
    }
       
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public void aceita(AtualizadorDeFuncionario atualizador) {
        atualizador.atualiza(this);
    }
}
