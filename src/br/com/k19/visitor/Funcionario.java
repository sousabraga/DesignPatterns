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
public class Funcionario implements Atualizavel {
    
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void aceita(AtualizadorDeFuncionario atualizador) {}
}
