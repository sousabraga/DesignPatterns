/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class Departamento {
    
    private String nome;
    List<Funcionario> funcionarios = new ArrayList<>();
    
    public Departamento(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
    
    public void aceita(AtualizadorDeFuncionario atualizador) {
        this.funcionarios.stream().forEach(funcionario -> funcionario.aceita(atualizador));
    }
}
